package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055739 [e^n]-th Prime.
 * @author Sean A. Irvine
 */
public class A055739 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mP = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    final long limit = CR.valueOf(++mN).exp().floor().longValueExact();
    while (mCount < limit) {
      mP = mPrime.nextPrime(mP);
      ++mCount;
    }
    return Z.valueOf(mP);
  }
}
