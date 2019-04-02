package irvine.oeis.a004;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004649 Prime(n) mod (n-1).
 * @author Sean A. Irvine
 */
public class A004649 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mN = mN.add(1);
    return mP.mod(mN);
  }
}

