package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A065442 Decimal expansion of Erd\u0151s-Borwein constant Sum_{k&gt;=1} 1/(2^k - 1).
 * @author Sean A. Irvine
 */
public class A065442 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A065442() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        Z sum = Z.ZERO;
        final Z t = Z.ONE.shiftLeft(-precision);
        for (int k = 1; k <= -precision; ++k) {
          sum = sum.add(t.divide(Z.ONE.shiftLeft(k).subtract(1)));
        }
        return sum;
      }
    });
  }
}
