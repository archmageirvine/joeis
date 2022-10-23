package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070738 Nonprimes n such that n^2 reduced modulo phi(n) = phi(n)^2 reduced modulo n.
 * @author Georg Fischer
 */
public class A070738 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final long t = LongUtils.phi(mN);
        if (mN * mN % t == t * t % mN) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
