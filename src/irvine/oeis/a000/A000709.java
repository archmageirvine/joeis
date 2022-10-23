package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000709 Related to population of numbers of form x^2 + y^2.
 * @author Sean A. Irvine
 */
public class A000709 extends Sequence1 {

  private int mN = -1;

  /**
   * Compute the integral <code>int_1^(2^k) du/sqrt(ln(u))</code>.
   * Uses the series <code>sum_{m=1}^infty (2/(2m-1)(m-1)!)(k*ln(2))^((2m-1)/2)</code>.
   * @param k parameter
   * @return value of integral
   */
  static CR sqrtLnInt2(final int k) {
    final CR aSqrt = CR.TWO.log().multiply(k).sqrt();
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int m = 0;
        Z f = Z.ONE;
        while (true) {
          if (m > 1) {
            f = f.multiply(m);
          }
          final int n = 2 * ++m - 1;
          final Z den = f.multiply(n);
          final Z t = aSqrt.pow(n).multiply(CR.TWO).getApprox(precision).divide(den);
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum;
      }
    };
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : sqrtLnInt2(mN).round();
  }
}
