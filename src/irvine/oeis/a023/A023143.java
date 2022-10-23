package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023143 Numbers k such that prime(k) == 1 (mod k).
 * @author Sean A. Irvine
 */
public class A023143 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;

  @Override
  public Z next() {
    if (mN == 0) {
      return Z.valueOf(++mN); // Avoid need for % mN on 1 below
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % ++mN == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
