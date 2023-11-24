package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066876 Numbers n such that prime(n+2) + prime(n-2) = 2*prime(n).
 * @author Sean A. Irvine
 */
public class A066876 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;
  private Z mQ = Z.FIVE;
  private Z mR = Z.SEVEN;
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z prev = mP;
      mP = mQ;
      mQ = mR;
      mR = mPrime.nextPrime(mR);
      if (prev.add(mPrime.nextPrime(mR)).equals(mQ.multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
