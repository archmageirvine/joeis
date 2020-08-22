package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001007 a(n) = ( Sum C(p,i); i=1,...,floor(2p/3) ) / p^2, where p = prime(n).
 * @author Sean A. Irvine
 */
public class A001007 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z sum = Z.ZERO;
    for (long k = 1; k <= 2 * mP / 3; ++k) {
      sum = sum.add(Binomial.binomial(mP, k));
    }
    return sum.divide(mP).divide(mP);
  }
}
