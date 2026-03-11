package irvine.oeis.a100;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A100666 a(n) = Sum_{k&gt;=0} k^n/Catalan(k) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A100666 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = -1;
  private CR mBiggestDelta = CR.ZERO;

  @Override
  public Z next() {
    ++mN;
    final CR z = new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          final Z t = CR.valueOf(Z.valueOf(++k).pow(mN)).divide(Functions.CATALAN.z(k)).getApprox(precision);
          if (k > 0 && t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    };
    final Z res = z.round();
    if (mVerbose) {
      final CR delta = z.subtract(res).abs();
      if (delta.compareTo(mBiggestDelta) > 0) {
        StringUtils.message("New record delta at n=" + mN + " " + delta + " from " + z);
        mBiggestDelta = delta;
      }
    }
    return z.round();
  }
}

