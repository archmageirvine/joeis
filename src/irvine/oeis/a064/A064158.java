package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064158 Integers n such that (x1*x2*..xk)^(x1+x2+..xk) = (x1+x2+..xk)^(x1*x2*...xk) where x1x2..xk are the digits of n in base 10.
 * @author Sean A. Irvine
 */
public class A064158 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long prod = Functions.DIGIT_PRODUCT.l(v);
      if (prod != 0) {
        final long sum = Functions.DIGIT_SUM.l(mN);
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
