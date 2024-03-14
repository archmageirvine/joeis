package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A068723.
 * @author Sean A. Irvine
 */
public class A068744 extends AbstractSequence {

  private int mN = -1;

  protected A068744(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A068744() {
    this(0);
  }

  private void update(final Map<List<Integer>, Z> counts, final List<Integer> input, final Z v, final int n, final int[] output, final int pos) {
    if (pos >= output.length) {
      counts.merge(IntegerUtils.toList(output), v, Z::add);
      return;
    }
    if (pos == 0 || pos == output.length - 1) {
      for (int t = -n; t <= n; ++t) {
        output[pos] = t;
        update(counts, input, v, n, output, pos + 1);
      }
    } else {
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
  }

  private void update(final Map<List<Integer>, Z> counts, final List<Integer> input, final Z v, final int n) {
    update(counts, input, v, n, new int[input.size() + 2], 0);
  }

  private boolean isCompatible(final List<Integer> a, final List<Integer> b) {
    assert a.size() == b.size();
    for (int k = 0; k < a.size(); k += 2) {
      if (a.get(k) + a.get(k + 1) + b.get(k) + b.get(k + 1) != 0) {
        return false;
      }
    }
    return true;
  }

  private Z combine(final Map<List<Integer>, Z> a, final Map<List<Integer>, Z> b) {
    // Think of "a" as the counts to reach the middle from the left
    // Think of "b" as reaching right edge of "a" from the far right
    // Multiply the number of ways for the corresponding entries to get total
    Z sum = Z.ZERO;
    for (final Map.Entry<List<Integer>, Z> e : a.entrySet()) {
      for (final Map.Entry<List<Integer>, Z> f : b.entrySet()) {
        if (isCompatible(e.getKey(), f.getKey())) {
          sum = sum.add(e.getValue().multiply(f.getValue()));
        }
      }
    }
    return sum;
  }

  protected Z potentialFlows(final int n, final int m) {
    if (m <= 1 || n < 1) {
      return Z.ONE;
    }
    // Compute one column at a time keeping track of flows across the right boundary
    // We only need to go halfway across then use symmetry to get the final counts
    // todo update this description, we are going diagonal here!
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
    return combine(counts, counts);
  }

  @Override
  public Z next() {
    return potentialFlows(++mN, 3);
  }
}
