package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A064152.
 * @author Sean A. Irvine
 */
public class A064157 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z prod = ZUtils.digitProduct(p);
      if (!prod.isZero()) {
        final long sum = ZUtils.digitSum(p);
        if (Jaguar.factor(sum).largestPrimeFactor().longValue() > 7) {
          continue;
        }
        if (Math.abs(prod.ln() * sum - Math.log(sum) * prod.longValue()) > 3) {
          continue;
        }
        if (prod.pow(sum).equals(Z.valueOf(sum).pow(prod))) {
          return p;
        }
      }
    }
  }
}
