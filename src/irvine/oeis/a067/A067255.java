package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067235.
 * @author Sean A. Irvine
 */
public class A067255 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (mM <= 1) {
      mM = ++mN;
      mP = 2;
    } else {
      mP = mPrime.nextPrime(mP);
    }
    long cnt = 0;
    while (mM % mP == 0) {
      ++cnt;
      mM /= mP;
    }
    return Z.valueOf(cnt);
  }
}

