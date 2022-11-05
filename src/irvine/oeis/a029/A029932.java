package irvine.oeis.a029;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A029932 Primes with record values of the least positive prime primitive root.
 * @author Sean A. Irvine
 */
public class A029932 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  protected Z mLeast = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      Z l = Z.ONE;
      do {
        l = mPrime.nextPrime(l);
      } while (!ZUtils.isPrimitiveRoot(l, mP));
      if (l.compareTo(mLeast) > 0) {
        mLeast = l;
        return mP;
      }
    }
  }
}
