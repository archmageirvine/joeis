package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062285 Numbers with the most significant digit even and alternating parity of digits.
 * @author Sean A. Irvine
 */
public class A062285 extends Sequence1 {

  private long mN = -1;
  private long mLim = 5;
  private long mStartAdd = 1;

  @Override
  public Z next() {
    long m = ++mN;
    if (m == mLim) {
      mStartAdd = 1 - mStartAdd;
      mLim *= 5;
    }
    long r = 0;
    long s = 1;
    long add = mStartAdd;
    while (m != 0) {
      add = 1 - add;
      r += (2 * (m % 5) + add) * s;
      m /= 5;
      s *= 10;
    }
    return Z.valueOf(r);
  }
}

