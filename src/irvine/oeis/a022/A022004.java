package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022004 Initial members of prime triples (p, p+2, p+6).
 * @author Sean A. Irvine
 */
public class A022004 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.add(2).isProbablePrime() && mP.add(6).isProbablePrime()) {
        return mP;
      }
    }
  }
}

