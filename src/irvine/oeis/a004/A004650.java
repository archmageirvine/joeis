package irvine.oeis.a004;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004650 <code>Prime(n) mod (n+1)</code>.
 * @author Sean A. Irvine
 */
public class A004650 implements Sequence {

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

