package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A064955 Position of n-th prime in A064413.
 * @author Sean A. Irvine
 */
public class A064955 extends A064664 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mM = 0;

  @Override
  public Z next() {
    while (++mM < mP) {
      super.next();
    }
    mP = mPrime.nextPrime(mP);
    return super.next();
  }
}
