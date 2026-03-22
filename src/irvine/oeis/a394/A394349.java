package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084269.
 * @author Sean A. Irvine
 */
public class A394349 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394349() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final Z t = CR.valueOf(++k).divide(CR.TAU.multiply(k).exp().add(1)).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
