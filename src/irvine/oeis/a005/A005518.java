package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005518 Largest label f(T) given to a rooted tree T with n nodes in Matula-Goebel labeling.
 * @author Sean A. Irvine
 */
public class A005518 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = -1;
  private long mP = 8;
  private long mPi = 4;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE.shiftLeft(mN);
    }
    final long prev = mP;
    while (mPi < prev) {
      mP = mPrime.nextPrime(mP);
      ++mPi;
    }
    return Z.valueOf(mP);
  }
}
