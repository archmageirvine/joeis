package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.partitions.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.util.Permutation;

/**
 * A067210 Number of n X n 0..2 matrices with all row and column sums equal.
 * @author Sean A. Irvine
 */
public class A067210 extends AbstractSequence {

  private final int mL;
  private int mN;

  /**
   * Construct with given offset and maximum element.
   * @param offset offset
   * @param maxElement maximum element
   */
  public A067210(final int offset, final int maxElement) {
    super(offset);
    mL = maxElement;
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A067210() {
    this(1, 2);
  }

  private void combine(final Map<List<Integer>, Z> res, final List<Integer> a, final Z v, final List<Integer> b, final int min, final int max) {
    for (int k = 0; k < a.size(); ++k) {
      final int c = a.get(k) + b.get(k);
      if (c > max || c < min) {
        return;
      }
    }
    final ArrayList<Integer> lst = new ArrayList<>();
    for (int k = 0; k < a.size(); ++k) {
      lst.add(a.get(k) + b.get(k));
    }
    Collections.sort(lst);
    res.merge(lst, v, Z::add);
  }

  private void combineList(final Map<List<Integer>, Z> res, final List<Integer> a, final Z v, final List<List<Integer>> b, final int min, final int max) {
    for (final List<Integer> t : b) {
      combine(res, a, v, t, min, max);
    }
  }

  private Map<List<Integer>, Z> combineList(final Map<List<Integer>, Z> a, final List<List<Integer>> b, final int min, final int max) {
    final Map<List<Integer>, Z> res = new HashMap<>();
    for (final Map.Entry<List<Integer>, Z> e : a.entrySet()) {
      combineList(res, e.getKey(), e.getValue(), b, min, max);
    }
    return res;
  }

  private List<List<Integer>> getCompositions(final int n, final int k) {
    final List<List<Integer>> c = new ArrayList<>();
    final FixedLengthPartition part = new FixedLengthPartition(k, n, 0, mL);
    int[] p;
    while ((p = part.next()) != null) {
      final Permutation perm = new Permutation(p);
      int[] q;
      while ((q = perm.next()) != null) {
        final ArrayList<Integer> lst = new ArrayList<>();
        for (final int v : q) {
          lst.add(v);
        }
        c.add(lst);
      }
    }
    return c;
  }

  private Z t(final int n, final int k) {
    final List<List<Integer>> c = getCompositions(n, k);
    final List<Integer> e = new ArrayList<>();
    for (int j = 0; j < n; ++j) {
      e.add(0);
    }
    Map<List<Integer>, Z> cnts = Collections.singletonMap(e, Z.ONE);
    for (int r = 0; r < n; ++r) {
      final int lo = k - (n - r) * mL;
      cnts = combineList(cnts, c, lo, k);
    }
    assert cnts.size() == 1;
    return ZUtils.sum(cnts.values());
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    // / 2 exploits symmetry
    for (int k = 0; k <= mL * mN / 2; ++k) {
      final Z t = t(mN, k);
      sum = sum.add(2 * k == mL * mN ? t : t.multiply2());
    }
    return sum;
  }
}
