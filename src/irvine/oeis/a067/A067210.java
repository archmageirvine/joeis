package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.partitions.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A008300.
 * @author Sean A. Irvine
 */
public class A067210 extends Sequence1 {

  // Works but is too slow to reproduce existing terms

  // todo there is some symmetry that could double speed, but that's not enough
  // todo perhaps the Permutation part can be "counted" rather than explicit?

  private int mL = 4;
  private int mN = 0;

  private List<Integer> addIfAllowed(final int k, final List<Integer> a, final List<Integer> b) {
    final ArrayList<Integer> sum = new ArrayList<>();
    for (int j = 0; j < a.size(); ++j) {
      final int s = a.get(j) + b.get(j);
      if (s > k) {
        return null;
      }
      sum.add(s);
    }
    return sum;
  }

  private Z t(final int n, final int k) {
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
    //System.out.println("(" + n + "," + k + ") -> " + c);
    Map<List<Integer>, Z> cnts = new HashMap<>();
    for (final List<Integer> v : c) {
      cnts.put(v, Z.ONE);
    }
    for (int r = 1; r < n; ++r) {
      Map<List<Integer>, Z> newCnts = new HashMap<>();
      for (final Map.Entry<List<Integer>, Z> e : cnts.entrySet()) {
        for (final List<Integer> f : c) {
          final List<Integer> add = addIfAllowed(k, e.getKey(), f);
          if (add != null) {
            newCnts.merge(add, e.getValue(), Z::add);
          }
        }
      }
      cnts = newCnts;
    }
    assert cnts.size() == 1;
//    System.out.println(cnts);
    return ZUtils.sum(cnts.values());
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mL * mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
