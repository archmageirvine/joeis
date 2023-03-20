package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A062088 Primes with every digit a prime and the sum of the digits a prime.
 * @author Sean A. Irvine
 */
public class A062088 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if ((ZUtils.syn(p) & 0b1101010011) == 0 && mPrime.isPrime(ZUtils.digitSum(p))) {
        return p;
      }
    }
  }
}
