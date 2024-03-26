package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A068951 Scan the primes, record digit-sum if it is itself prime.
 * @author Sean A. Irvine
 */
public class A068951 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final long s = ZUtils.digitSum(super.next());
      if (mPrime.isPrime(s)) {
        return Z.valueOf(s);
      }
    }
  }
}

