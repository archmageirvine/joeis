package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A051158 Decimal expansion of Sum_{n &gt;= 0} 1/(2^2^n+1).
 * @author Sean A. Irvine
 */
public class A051158 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051158() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        Z sum = Z.ZERO;
        int k = -1;
        while (true) {
          final int shift = 1 << ++k;
          final Z t = one.divide(Z.ONE.shiftLeft(shift).add(1));
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum;
      }
    });
  }
}
