package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064157 Primes p such that (x1*x2*..xk)^(x1+x2+..xk)=(x1+x2+..xk)^(x1*x2*...xk) where x1x2..xk are the digits of p in base 10.
 * @author Sean A. Irvine
 */
public class A064157 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z prod = Functions.DIGIT_PRODUCT.z(p);
      if (!prod.isZero()) {
        final long sum = Functions.DIGIT_SUM.l(p);
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
