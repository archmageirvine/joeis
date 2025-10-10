package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388852 Decimal expansion of 6*Sum_{k&gt;=0} 12^(-2^k).
 * @author Sean A. Irvine
 */
public class A388852 extends DecimalExpansionSequence {

  private static final Z Z12 = Z.valueOf(12);

  /** Construct the sequence. */
  public A388852() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        long k = -1;
        while (true) {
          final Z t = one.divide(Z12.pow(1L << ++k));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.multiply(6));
  }
}
