package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A048649 Decimal expansion of Sum_{m&gt;=0} 1/(2^2^m - 1).
 * @author Sean A. Irvine
 */
public class A048649 extends DecimalExpansionSequence {

  private static final CR N = new CR() {
    @Override
    protected Z approximate(final int precision) {
      Z sum = Z.ZERO;
      if (precision < 0) {
        final Z t = Z.ONE.shiftLeft(-precision);
        for (int k = 0; 1 << k <= -precision; ++k) {
          sum = sum.add(t.divide(Z.ONE.shiftLeft(1 << k).subtract(1)));
        }
      }
      return sum;
    }
  };

  @Override
  protected CR getCR() {
    return N;
  }
}
