package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055616 Numbers, with an even number of digits, that are the sum of the squares of their two halves (leading zeros allowed only for the second half).
 * @author Sean A. Irvine
 */
public class A055616 implements Sequence {

  private long mLim = 100;
  private long mN = 12;
  private long mM = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mLim) {
        if (++mN == mLim) {
          mLim *= 10;
        }
        mM = 0;
      }
      final long s = mN * mN + mM * mM;
      if (s == mN * mLim + mM) {
        return Z.valueOf(s);
      }
    }
  }
}
