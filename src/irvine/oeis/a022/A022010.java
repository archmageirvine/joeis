package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022010 Initial members of prime septuplets (p, p+2, p+8, p+12, p+14, p+18, p+20).
 * @author Sean A. Irvine
 */
public class A022010 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(5637);

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.add(2).isProbablePrime()
        && mP.add(8).isProbablePrime()
        && mP.add(12).isProbablePrime()
        && mP.add(14).isProbablePrime()
        && mP.add(18).isProbablePrime()
        && mP.add(20).isProbablePrime()) {
        return mP;
      }
    }
  }
}

