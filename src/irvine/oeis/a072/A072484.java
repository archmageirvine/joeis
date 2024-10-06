package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072484 Triangle in which the n-th row contains the n smallest numbers containing the string of digits of n in increasing order.
 * @author Sean A. Irvine
 */
public class A072484 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mR = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      mM = 0;
      mR = mN - 1;
    }
    while (true) {
      long v = ++mR;
      while (v >= mN) {
        if (v % mMod == mN) {
          return Z.valueOf(mR);
        }
        v /= 10;
      }
    }
  }
}

