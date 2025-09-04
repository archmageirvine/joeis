package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080092 Irregular triangle read by rows, giving prime sequences (p-1|2n) appearing in the n-th von Staudt-Clausen sum.
 * @author Sean A. Irvine
 */
public class A080092 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private long mP = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN + 1) {
        ++mN;
        mM = 0;
        mP = 1;
      }
      mP = mPrime.nextPrime(mP);
      if ((2 * mN) % (mP - 1) == 0) {
        return Z.valueOf(mP);
      }
    }
  }
}
