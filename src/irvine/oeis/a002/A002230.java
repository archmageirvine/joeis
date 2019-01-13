package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.ZUtils;

/**
 * A002230.
 * @author Sean A. Irvine
 */
public class A002230 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  protected Z mLeast = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z l = ZUtils.leastPrimitiveRoot(mP);
      if (l.compareTo(mLeast) > 0) {
        mLeast = l;
        return mP;
      }
    }
  }
}
