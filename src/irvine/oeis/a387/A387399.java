package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387399 allocated for Daniel Hoyt.
 * @author Sean A. Irvine
 */
public class A387399 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387399() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          final Z t = one.divide(Functions.FACTORIAL.z(1L << ++k));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

