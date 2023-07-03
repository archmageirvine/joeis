package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A033435 Continued fraction for Champernowne constant = 0.01234567891011121314...
 * @author Sean A. Irvine
 */
public class A033435 extends ContinuedFractionSequence {

  private static final double BITS_PER_DIGIT = Math.log(10) / Math.log(2);

  /** Construct the sequence. */
  public A033435() {
    super(0, new DecimalExpansionSequence(new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        final int length = 10 - (int) (precision / BITS_PER_DIGIT);
        final StringBuilder s = new StringBuilder();
        long k = 0;
        while (s.length() < length) {
          s.append(++k);
        }
        return CR.valueOf(new Q(new Z(s), Z.TEN.pow(s.length() + 1))).getApprox(precision);
      }
    }), 1000);
  }
}
