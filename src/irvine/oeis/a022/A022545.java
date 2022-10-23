package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022545 Initial members of prime nonuplets (p, p+2, p+6, p+8, p+12, p+18, p+20, p+26, p+30).
 * @author Sean A. Irvine
 */
public class A022545 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.add(2).isProbablePrime()
        && mP.add(6).isProbablePrime()
        && mP.add(8).isProbablePrime()
        && mP.add(12).isProbablePrime()
        && mP.add(18).isProbablePrime()
        && mP.add(20).isProbablePrime()
        && mP.add(26).isProbablePrime()
        && mP.add(30).isProbablePrime()) {
        return mP;
      }
    }
  }
}

