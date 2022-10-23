package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023147 Numbers k such that prime(k) == 5 (mod k).
 * @author Sean A. Irvine
 */
public class A023147 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 5;

  @Override
  public Z next() {
    if (mN <= 2) {
      return Z.valueOf(++mN); // Avoid need for % mN on 5 below
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % ++mN == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
