package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052034 Primes such that the sum of the squares of their digits is also a prime.
 * @author Sean A. Irvine
 */
public class A052034 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(Functions.DIGIT_SUM_SQUARES.l(p))) {
        return p;
      }
    }
  }
}
