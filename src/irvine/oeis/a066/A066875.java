package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006562.
 * @author Sean A. Irvine
 */
public class A066875 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z prev = mP;
      mP = mPrime.nextPrime(mP);
      if (prev.add(mPrime.nextPrime(mP)).equals(mP.multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
