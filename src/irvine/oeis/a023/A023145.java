package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023145 Numbers n such that prime(n) == 3 (mod n).
 * @author Sean A. Irvine
 */
public class A023145 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 3;

  @Override
  public Z next() {
    if (mN <= 1) {
      return Z.valueOf(++mN); // Avoid need for % mN on 3 below
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % ++mN == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
