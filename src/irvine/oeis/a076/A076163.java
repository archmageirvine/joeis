package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076163 Primes p such that the absolute value of p minus the sum of squares of digits of p is also prime.
 * @author Sean A. Irvine
 */
public class A076163 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.subtract(Functions.DIGIT_SUM_SQUARES.z(p)).abs().isProbablePrime()) {
        return p;
      }
    }
  }
}
