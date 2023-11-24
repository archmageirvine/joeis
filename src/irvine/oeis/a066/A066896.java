package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066896 prime(2n) + prime(n) == 0 (mod n).
 * @author Sean A. Irvine
 */
public class A066896 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mQ = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mPrime.nextPrime(mP));
      mQ = mPrime.nextPrime(mQ);
      if (mP.add(mQ).mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

