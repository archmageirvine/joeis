package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A002230 Primes with record values of the least positive primitive root.
 * @author Sean A. Irvine
 */
public class A002230 extends Sequence1 {

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
