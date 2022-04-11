package irvine.oeis.a100;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A100609 Decimal expansion of the constant whose continued fraction representation is [e^0; e^1, e^2, e^3, e^4, ...] where e is A001113 and the exponents cycle through all nonnegative integers.
 * @author Sean A. Irvine
 */
public class A100609 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A100609() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        // Determine number of terms needed
        int k = 1;
        while (!CR.valueOf(++k).exp().inverse().getApprox(precision).isZero()) {
          // do nothing
        }
        final Z one = CR.ONE.getApprox(2 * precision);
        Z z = Z.ZERO;
        while (k > 0) {
          final Z t = CR.valueOf(k).exp().getApprox(precision).add(z);
          z = one.divide(t);
          --k;
        }
        return z.add(CR.ONE.getApprox(precision));
      }
    });
  }
}
