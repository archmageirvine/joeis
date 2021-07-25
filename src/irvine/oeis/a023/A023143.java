package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023143 Numbers k such that prime(k) == 1 (mod k).
 * @author Sean A. Irvine
 */
public class A023143 implements Sequence {

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
