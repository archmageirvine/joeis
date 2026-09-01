package irvine.oeis.a247;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A247551 Decimal expansion of Product_{k&gt;=2} 1/(1-1/k!).
 * @author Sean A. Irvine
 */
public class A247551 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A247551() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z prod = one;
        long k = 1;
        while (true) {
          final Z t = one.divide(Functions.FACTORIAL.z(++k));
          if (t.isZero()) {
            return prod;
          }
          prod = prod.multiply(one.subtract(t)).shiftRight(-precision);
        }
      }
    }.inverse());
  }
}
