package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A064423 Position of n-th prime in A064413 (if it begins at 2).
 * @author Sean A. Irvine
 */
public class A064423 extends A064421 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mM = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (++mM < mP) {
      super.next();
    }
    return super.next();
  }
}
