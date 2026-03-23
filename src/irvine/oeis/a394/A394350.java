package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394350 Decimal expansion of Sum_{n&gt;=1} 1/(e^(2*Pi*n)-1).
 * @author Sean A. Irvine
 */
public class A394350 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394350() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final Z t = CR.TAU.multiply(++k).exp().subtract(1).inverse().getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
