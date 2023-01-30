package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a001.A001672;

/**
 * A071973 Number of primes less than or equal to Pi^n.
 * @author Sean A. Irvine
 */
public class A071973 extends A001672 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private Z mP = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    while (mP.compareTo(t) <= 0) {
      mP = mPrime.nextPrime(mP);
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
