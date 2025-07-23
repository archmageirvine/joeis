package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078887 Decimal expansion of Sum {n&gt;=0} 1/6^(2^n).
 * @author Sean A. Irvine
 */
public class A078887 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078887() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = one.divide(6); // 1/6
        int k = 0;
        while (true) {
          final Z t = one.divide(Z.SIX.pow(1L << ++k));
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
