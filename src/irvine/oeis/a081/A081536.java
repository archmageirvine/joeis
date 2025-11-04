package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081536 Let f(n) be smallest number k which is a sum of n distinct numbers whose LCM is a multiple of k. Sequence gives triangle read by rows in which n-th row consists of those n numbers (row 2 is 0, 0 by convention).
 * @author Sean A. Irvine
 */
public class A081536 extends A081535 {

  protected Z[] mRow = {};
  private int mM = 0;

  protected void step() {
    final Z ss = super.next();
    final long s = ss.longValue();
    final int n = mRow.length + 1;
    if (n <= 2) {
      if (n == 1) {
        mRow = new Z[] {Z.ONE};
      } else {
        mRow = new Z[] {Z.ZERO, Z.ZERO};
      }
    } else {
      mRow = new Z[n];
      for (int k = 0; k < n - 2; ++k) {
        mRow[k] = Z.valueOf(k + 1);
      }
      final long gpp = gpp(s);
      if (gpp < n) {
        mRow[n - 2] = Z.valueOf(n - 1);
        mRow[n - 1] = ss.subtract(n * (n - 1L) / 2);
      } else {
        final long b = s - (n - 1L) * (n - 2) / 2 - gpp;
        if (b < gpp) {
          mRow[n - 2] = Z.valueOf(b);
          mRow[n - 1] = Z.valueOf(gpp);
        } else {
          mRow[n - 2] = Z.valueOf(gpp);
          mRow[n - 1] = Z.valueOf(b);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      step();
      mM = 0;
    }
    return mRow[mM];
  }
}
