package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023148 Numbers n such that prime(n) == 6 (mod n).
 * @author Sean A. Irvine
 */
public class A023148 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 5;

  @Override
  public Z next() {
    if (mN <= 1) {
      if (mN == 1) {
        mN = 3;
        return Z.FIVE;
      }
      return Z.valueOf(++mN); // Avoid need for % mN on 6 below
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % ++mN == 6) {
        return Z.valueOf(mN);
      }
    }
  }
}
