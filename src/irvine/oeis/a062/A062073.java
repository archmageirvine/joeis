package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A062073 Decimal expansion of Fibonacci factorial constant.
 * @author Sean A. Irvine
 */
public class A062073 extends DecimalExpansionSequence {

  private static final CR A = CR.PHI.square().inverse().negate();
  private static final int EXTRA_PRECISION = 5;

  /** Construct the sequence. */
  public A062073() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int prec = precision - EXTRA_PRECISION;
        final Z one = CR.scale(Z.ONE, -prec);
        Z prod = one;
        long k = 0;
        while (true) {
          Z t = A.pow(++k).getApprox(prec);
          if (t.isZero()) {
            return CR.scale(prod, -EXTRA_PRECISION);
          }
          prod = CR.scale(prod.multiply(one.subtract(t)), prec);
        }
      }
    });
  }
}
