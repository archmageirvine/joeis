package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023151 Numbers k such that prime(k) == 9 (mod k).
 * @author Sean A. Irvine
 */
public class A023151 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % ++mN == 9 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
