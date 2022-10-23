package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051686 Smallest prime p such that 2n*p+1 is also prime.
 * @author Sean A. Irvine
 */
public class A051686 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mN.multiply(p).add(1).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
