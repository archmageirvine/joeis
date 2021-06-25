package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A048651 Decimal expansion of Product_{k &gt;= 1} (1 - 1/2^k).
 * @author Sean A. Irvine
 */
public class A048651 extends DecimalExpansionSequence {

  private static final CR N = new CR() {
    @Override
    protected Z approximate(final int precision) {
      if (precision >= 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final Z t = Z.ONE.shiftLeft(-precision);
      for (int k = 1; k <= -precision; ++k) {
        sum = sum.add(t.divide(Z.ONE.subtract(Z.ONE.shiftLeft(k)).multiply(k)));
      }
      return sum;
    }
  }.exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
