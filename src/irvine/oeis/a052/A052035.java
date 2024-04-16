package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A052035 Palindromic primes whose sum of squared digits is also prime.
 * @author Sean A. Irvine
 */
public class A052035 extends A002385 {

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
