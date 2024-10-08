package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072509 Number of Fibonacci numbers F(k) &lt;= 10^n which end in 1.
 * @author Sean A. Irvine
 */
public class A072509 extends Sequence0 {

  private static final long[] R = {1, 2, 8, 19, 22, 28, 41, 59};
  private Z mLim = null;
  private long mN = 0;
  private int mM = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply(10);
    while (Functions.FIBONACCI.z(60 * mN + R[mM]).compareTo(mLim) <= 0) {
      ++mCount;
      if (++mM == R.length) {
        ++mN;
        mM = 0;
      }
    }
    return Z.valueOf(mCount);
  }
}
