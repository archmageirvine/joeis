package irvine.oeis.a004;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004648 <code>a(n) =</code> prime(n) <code>mod n</code>.
 * @author Sean A. Irvine
 */
public class A004648 implements Sequence {

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

