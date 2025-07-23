package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078890 Decimal expansion of Sum {n&gt;=0} 1/9^(2^n).
 * @author Sean A. Irvine
 */
public class A078890 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078890() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = one.divide(9); // 1/9
        int k = 0;
        while (true) {
          final Z t = one.divide(Z.NINE.pow(1L << ++k));
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
