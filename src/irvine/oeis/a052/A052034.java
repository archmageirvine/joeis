package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
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
      if (mPrime.isPrime(ZUtils.digitSumSquares(p))) {
        return p;
      }
    }
  }
}
