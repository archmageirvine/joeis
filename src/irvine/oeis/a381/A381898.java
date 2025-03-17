package irvine.oeis.a381;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A381898 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A381898 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A381898() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = 1;
        while (true) {
          final Z t = CR.valueOf(++k).log().getApprox(precision).divide(Z.valueOf(k).shiftLeft(k));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.divide(CR.LOG2).exp());
  }
}
