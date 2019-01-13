package irvine.oeis.a004;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004232.
 * @author Sean A. Irvine
 */
public class A004232 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return mP.add(Z.valueOf(++mN).square());
  }
}
