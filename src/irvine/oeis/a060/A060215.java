package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A060215 Least a(n) such that the period of continued fraction for sqrt(a(n)) has at least n successive 1's.
 * @author Sean A. Irvine
 */
public class A060215 extends Sequence0 {

  private int mN = -1;
  private int mCnt = -1;
  private int mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mN > mCnt) {
      final ContinuedFractionOfSqrtSequence cf = new ContinuedFractionOfSqrtSequence(0, ++mM);
      cf.fillPeriod();
      int max = 0;
      int k = 0;
      while (k < cf.getPeriodLength()) {
        if (cf.getPeriodElement(k) == 1) {
          int c = 1;
          while (++k < cf.getPeriodLength() && cf.getPeriodElement(k) == 1) {
            ++c;
          }
          if (c > max) {
            max = c;
          }
        }
        ++k;
      }
      if (max > mCnt) {
        mCnt = max;
      }
    }
    return Z.valueOf(mM);
  }
}

