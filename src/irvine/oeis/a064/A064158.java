package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064152.
 * @author Sean A. Irvine
 */
public class A064158 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long prod = ZUtils.digitProduct(++mN);
      if (prod != 0) {
        final long sum = ZUtils.digitSum(mN);
        if (Jaguar.factor(sum).largestPrimeFactor().longValue() > 7) {
          continue;
        }
        if (Z.valueOf(prod).pow(sum).equals(Z.valueOf(sum).pow(prod))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
