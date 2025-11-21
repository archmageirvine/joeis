package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081984 Primes p such that p-1 is divisible by the digital product ( of nonzero digits) of p.
 * @author Sean A. Irvine
 */
public class A081984 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.subtract(1).mod(Functions.DIGIT_NZ_PRODUCT.z(p)).isZero()) {
        return p;
      }
    }
  }
}
