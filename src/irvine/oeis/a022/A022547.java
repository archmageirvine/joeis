package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022547 Initial members of prime nonuplets (p, p+4, p+6, p+10, p+16, p+18, p+24, p+28, p+30).
 * @author Sean A. Irvine
 */
public class A022547 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(12);

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.add(4).isProbablePrime()
        && mP.add(6).isProbablePrime()
        && mP.add(10).isProbablePrime()
        && mP.add(16).isProbablePrime()
        && mP.add(18).isProbablePrime()
        && mP.add(24).isProbablePrime()
        && mP.add(28).isProbablePrime()
        && mP.add(30).isProbablePrime()) {
        return mP;
      }
    }
  }
}

