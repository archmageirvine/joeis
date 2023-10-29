package irvine.oeis.a004;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004650 a(n) = prime(n) mod (n+1).
 * @author Sean A. Irvine
 */
public class A004650 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mN = mN.add(1);
    return mP.mod(mN);
  }
}

