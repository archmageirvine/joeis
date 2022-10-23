package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023144 Numbers k such that prime(k) == 2 (mod k).
 * @author Sean A. Irvine
 */
public class A023144 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;

  @Override
  public Z next() {
    if (mN == 0) {
      return Z.valueOf(++mN); // Avoid need for % mN on 2 below
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % ++mN == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
