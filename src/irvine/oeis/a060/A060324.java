package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060324 a(n) is the minimal prime q such that n*(q+1)-1 is prime, that is, the smallest prime q so that n = (p+1)/(q+1) with p prime; or a(n) = -1 if no such q exists.
 * @author Sean A. Irvine
 */
public class A060324 extends Sequence1 {

  private final Fast mPrime = new Fast();
  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mN.multiply(p + 1).subtract(1).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
