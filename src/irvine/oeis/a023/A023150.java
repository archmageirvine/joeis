package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023150 Numbers k such that prime(k) == 8 (mod k).
 * @author Sean A. Irvine
 */
public class A023150 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % ++mN == 8 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
