package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022013 Initial members of prime octuplets (p, p+6, p+8, p+14, p+18, p+20, p+24, p+26).
 * @author Sean A. Irvine
 */
public class A022013 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(88791);

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.add(6).isProbablePrime()
        && mP.add(8).isProbablePrime()
        && mP.add(14).isProbablePrime()
        && mP.add(18).isProbablePrime()
        && mP.add(20).isProbablePrime()
        && mP.add(24).isProbablePrime()
        && mP.add(26).isProbablePrime()) {
        return mP;
      }
    }
  }
}

