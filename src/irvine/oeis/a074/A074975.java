package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a005.A005101;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A074975 extends A005101 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final int[] cnts = ZUtils.digitCounts(t);
      Z sum = Z.ZERO;
      for (int k = 0; k < cnts.length; ++k) {
        sum = sum.add(Z.valueOf(k).pow(k).multiply(cnts[k]));
      }
      if (Predicates.ABUNDANT.is(sum)) {
        return t;
      }
    }
  }
}
