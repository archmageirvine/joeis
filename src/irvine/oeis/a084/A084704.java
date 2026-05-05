package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A084704 Smallest prime p &gt; prime(n) such that (p + prime(n))/2 is prime.
 * @author Sean A. Irvine
 */
public class A084704 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z q = mP;
    while (true) {
      q = mPrime.nextPrime(q);
      if (q.add(mP).divide2().isProbablePrime()) {
        return q;
      }
    }
  }
}
