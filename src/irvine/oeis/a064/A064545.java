package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064545 Lesser of two consecutive primes such that n*p + q is a perfect square, p &lt; q.
 * @author Sean A. Irvine
 */
public class A064545 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    long q = 2;
    while (true) {
      final long p = q;
      q = mPrime.nextPrime(q);
      if (Z.valueOf(p).multiply(mN).add(q).isSquare()) {
        return Z.valueOf(p);
      }
    }
  }
}

