package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A068723 Number of solenoidal flows (flow in = flow out) in a 4 X 4 square array with integer velocities -n .. n.
 * @author Sean A. Irvine
 */
public class A068723 extends AbstractSequence {

  private int mN = -1;

  protected A068723(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A068723() {
    this(0);
  }

  private void update(final Map<List<Integer>, Z> counts, final List<Integer> input, final Z v, final int max, final int[] output, final int down, final int pos) {
    if (pos >= output.length) {
      if (down == 0) {
        counts.merge(IntegerUtils.toList(output), v, Z::add);
      }
      return;
    }
    final int left = input.get(pos);
    final int in = left + down;
    // Loop over the possible right flows given the current in flow
    final int lim = Math.min(max, in + max);
    for (int right = Math.max(-max, in - max); right <= lim; ++right) {
      final int newDown = in - right;
      output[pos] = right;
      update(counts, input, v, max, output, newDown, pos + 1);
    }
  }

  private void update(final Map<List<Integer>, Z> counts, final List<Integer> input, final Z v, final int max) {
    update(counts, input, v, max, new int[input.size()], 0, 0);
  }

  private Z combine(final Map<List<Integer>, Z> a, final Map<List<Integer>, Z> b) {
    // Think of "a" as the counts to reach the middle from the left
    // Think of "b" as reaching right edge of "a" from the far right
    // Multiply the number of ways for the corresponding entries to get total
    Z sum = Z.ZERO;
    for (final Map.Entry<List<Integer>, Z> e : a.entrySet()) {
      final List<Integer> inverse = new ArrayList<>();
      for (final int v : e.getKey()) {
        inverse.add(-v);
      }
      final Z t = b.get(inverse);
      if (t != null) {
        sum = sum.add(e.getValue().multiply(t));
      }
    }
    return sum;
  }

  protected Z solenoidalFlows(final int size, final int max) {
    // Compute one column at a time keeping track of flows across the right boundary
    // We only need to go halfway across then use symmetry to get the final counts
    Map<List<Integer>, Z> counts = new HashMap<>();
    final List<Integer> zero = new ArrayList<>();
    for (int k = 0; k < size; ++k) {
      zero.add(0);
    }
    counts.put(zero, Z.ONE); // 1 way to have no flow
    Map<List<Integer>, Z> prev = counts;

    for (int k = 0; k < (size + 1) / 2; ++k) {
      final Map<List<Integer>, Z> newCounts = new HashMap<>();
      for (final Map.Entry<List<Integer>, Z> e : counts.entrySet()) {
        update(newCounts, e.getKey(), e.getValue(), max);
      }
      prev = counts;
      counts = newCounts;
    }
    return combine(counts, (size & 1) == 0 ? counts : prev);
  }

  @Override
  public Z next() {
    return solenoidalFlows(4, ++mN);
  }
}
