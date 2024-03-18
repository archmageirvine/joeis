package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A068744 Number of potential flows in 3 X 3 array with integer velocities in -n..n, i.e., number of 3 X 3 arrays with adjacent elements differing by no more than n, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068744 extends AbstractSequence {

  // The "velocities" in this sequence correspond to the "edges" (adjacencies) between the
  // actual values in the matrix. It is the velocities which are constrained to be in [-n,n]
  // not the matrix values themselves.
  //
  // For example, in the 3x3 matrix there are 12 velocities.
  //
  // Rather than work directly with matrix elements, we instead work with the velocities
  // and we pass through the matrix in a diagonal fashion. Viz, 3x3 matrix with velocities
  // "a" through "l":
  //
  //  +---+---+---+
  //  |   |   |   |
  //  |   a   c   |
  //  |   |   |   |
  //  +-b-+-d-+-g-+
  //  |   |   |   |
  //  |   e   h   |
  //  |   |   |   |
  //  +-f-+-i-+-k-+
  //  |   |   |   |
  //  |   j   l   |
  //  |   |   |   |
  //  +---+---+---+
  //
  // we can rotate 45 degrees and view it like this:
  //
  //     cg
  //    adhk
  //    beil
  //     fj
  //
  // In our computation, we then go column-wise in this rotated view.
  // We go halfway across (to the column starting with c in this example),
  // then use symmetry to combine.
  //
  // Despite the above, this approach is apparently much slower than R. H. Hardin's
  // COSPAN solver on this problem.

  private int mN = -1;

  protected A068744(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A068744() {
    this(0);
  }

  private void update(final Map<List<Integer>, Z> counts, final List<Integer> input, final Z v, final int n, final int[] output, final int pos) {
    if (pos >= output.length - 1) {
      // output[0] and output[output.length-1] are free to be any value in [-n,n]
      for (int k = -n; k <= n; ++k) {
        output[0] = k;
        for (int j = -n; j <= n; ++j) {
          output[output.length - 1] = j;
          counts.merge(IntegerUtils.toList(output), v, Z::add);
        }
      }
      return;
    }
    // Loop over the possible right flows given the current in flow
    for (int t = -n; t <= n; ++t) {
      final int u = input.get(pos - 1) + input.get(pos) - t;
      if (u >= -n && u <= n) {
        output[pos] = t;
        output[pos + 1] = u;
        update(counts, input, v, n, output, pos + 2);
      }
    }
  }

  private void update(final Map<List<Integer>, Z> counts, final List<Integer> input, final Z v, final int n) {
    update(counts, input, v, n, new int[input.size() + 2], 1);
  }

  private Z mSum = Z.ZERO;

  private void combine(final Map<List<Integer>, Z> b, final List<Integer> input, final Z v, final int n, final int[] output, final int pos) {
    if (pos >= output.length) {
      final Z u = b.get(IntegerUtils.toList(output));
      if (u != null) {
        mSum = mSum.add(v.multiply(u));
      }
      return;
    }
    // Loop over the possible right flows given the current in flow
    for (int t = -n; t <= n; ++t) {
      final int u = input.get(pos) + input.get(pos + 1) - t;
      if (u >= -n && u <= n) {
        output[pos] = t;
        output[pos + 1] = u;
        combine(b, input, v, n, output, pos + 2);
      }
    }
  }

  private Z combine(final Map<List<Integer>, Z> a, final Map<List<Integer>, Z> b, final int n) {
    // Think of "a" as the counts to reach the middle from the left
    // Think of "b" as reaching right edge of "a" from the far right
    // Multiply the number of ways for the corresponding entries to get total
    mSum = Z.ZERO;
    for (final Map.Entry<List<Integer>, Z> e : a.entrySet()) {
      final List<Integer> input = e.getKey();
      combine(b, input, e.getValue(), n, new int[input.size()], 0);
    }
    return mSum;
  }

  protected Z potentialFlows(final int n, final int m) {
    if (m <= 1 || n < 1) {
      return Z.ONE;
    }
    // Compute one column at a time keeping track of flows across the right boundary
    // We only need to go halfway across then use symmetry to get the final counts
    Map<List<Integer>, Z> counts = new HashMap<>();
    for (int k = -n; k <= n; ++k) {
      for (int j = -n; j <= n; ++j) {
        final List<Integer> v = new ArrayList<>();
        v.add(k);
        v.add(j);
        counts.put(v, Z.ONE);
      }
    }
    for (int k = 1; k < m - 1; ++k) {
      final Map<List<Integer>, Z> newCounts = new HashMap<>();
      for (final Map.Entry<List<Integer>, Z> e : counts.entrySet()) {
        update(newCounts, e.getKey(), e.getValue(), n);
      }
      counts = newCounts;
    }
    return combine(counts, counts, n);
  }

  @Override
  public Z next() {
    return potentialFlows(++mN, 3);
  }
}
