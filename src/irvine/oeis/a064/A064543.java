package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064543 Lesser of two consecutive primes such that p + n*q is a perfect square, p &lt; q.
 * @author Sean A. Irvine
 */
public class A064543 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    long q = 3;
    while (true) {
      final long p = q;
      q = mPrime.nextPrime(q);
      if (Z.valueOf(q).multiply(mN).add(p).isSquare()) {
        return Z.valueOf(p);
      }
    }
  }
}

