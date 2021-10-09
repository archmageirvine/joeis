package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A048651 Decimal expansion of Product_{k &gt;= 1} (1 - 1/2^k).
 * @author Sean A. Irvine
 */
public class A048651 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A048651() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        if (precision < 0) {
          final Z t = Z.ONE.shiftLeft(-precision);
          for (int k = 1; k <= -precision; ++k) {
            sum = sum.add(t.divide(Z.ONE.subtract(Z.ONE.shiftLeft(k)).multiply(k)));
          }
        }
        return sum;
      }
    }.exp());
  }
}
