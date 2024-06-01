package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004426 Arithmetic mean of digits of n (rounded down).
 * @author Sean A. Irvine
 */
public class A004426 extends Sequence0 {

  private long mN = -1;
  private long mLim = 10;
  private long mDiv = 1;

  @Override
  public Z next() {
    final long s = Functions.DIGIT_SUM.l(++mN);
    if (mN >= mLim) {
      mLim *= 10;
      ++mDiv;
    }
    return Z.valueOf(s / mDiv);
  }
}

