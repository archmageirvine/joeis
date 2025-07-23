package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078889 Decimal expansion of Sum {n&gt;=0} 1/8^(2^n).
 * @author Sean A. Irvine
 */
public class A078889 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078889() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = one.divide(8); // 1/8
        int k = 0;
        while (true) {
          final Z t = one.divide(Z.ONE.shiftLeft(3 * (1L << ++k)));
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
