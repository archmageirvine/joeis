package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023149 Numbers n such that prime(n) == 7 (mod n).
 * @author Sean A. Irvine
 */
public class A023149 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % ++mN == 7 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
