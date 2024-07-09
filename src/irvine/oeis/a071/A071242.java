package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071242 Arithmetic mean of n and R(n) where n is a number such that the least significant digit and the most significant digits are of same parity and R(n) is its digit reversal (A004086).
 * @author Sean A. Irvine
 */
public class A071242 extends Sequence1 {

  private long mN = -1;
  private long mM = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mM = mLim;
        mLim *= 10;
      }
      if ((mN & 1) == ((mN / mM) & 1)) {
        return Functions.REVERSE.z(mN).add(mN).divide2();
      }
    }
  }
}
