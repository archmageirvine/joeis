package irvine.oeis.a004;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004648 a(n) = prime(n) mod n.
 * @author Sean A. Irvine
 */
public class A004648 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mN = mN.add(1);
    return mP.mod(mN);
  }
}

