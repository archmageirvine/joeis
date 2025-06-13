package irvine.oeis.a077;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A077760 Numbers which in at least two ways are the product of two distinct numbers with the same digits (leading zeros are forbidden).
 * @author Sean A. Irvine
 */
public class A077760 extends Sequence1 {

  private final TreeMap<Z, Long> mRepresentations = new TreeMap<>();
  private Z mM = Z.ONE;


  @Override
  public Z next() {
    while (true) {
      while (mRepresentations.isEmpty() || mRepresentations.firstKey().compareTo(mM.square()) >= 0) {
        final Permutation perm = Permutation.permuter(mM);
        int[] p;
        while ((p = perm.next()) != null) {
          if (p[0] != 0) {
            final Z v = Permutation.permToZ(p);
            if (v.compareTo(mM) > 0) {
              mRepresentations.merge(v.multiply(mM), 1L, Long::sum);
            }
          }
        }
        mM = mM.add(1);
      }
      final Map.Entry<Z, Long> e = mRepresentations.pollFirstEntry();
      if (e.getValue() > 1) {
        return e.getKey();
      }
    }
  }
}

