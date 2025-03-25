package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076162 Primes p such that p + sum of squares of digits of p is also prime.
 * @author Sean A. Irvine
 */
public class A076162 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.DIGIT_SUM_SQUARES.z(p).add(p).isProbablePrime()) {
        return p;
      }
    }
  }
}
