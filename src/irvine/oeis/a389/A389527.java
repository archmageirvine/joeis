package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389527 allocated for Daniel Hoyt.
 * @author Sean A. Irvine
 */
public class A389527 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389527() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        long k = -1;
        while (true) {
          final Z t = one.divide(Z.SIX.pow(1L << ++k));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.multiply(3));
  }
}
