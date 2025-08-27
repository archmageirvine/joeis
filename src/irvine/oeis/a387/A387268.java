package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A079759.
 * @author Sean A. Irvine
 */
public class A387268 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387268() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          final Z t = one.divide(Functions.FACTORIAL.z(Functions.FACTORIAL.z(++k)));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.signedAdd((k & 1) == 0, t);
        }
      }
    });
  }
}

