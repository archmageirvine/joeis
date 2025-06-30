package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074904 Decimal expansion of trace of Gaussian operator.
 * @author Sean A. Irvine
 */
public class A074904 extends DecimalExpansionSequence {

  private static CR build() {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int k = 1;
        while (true) {
          final Z v = Zeta.zeta(2 * ++k).subtract(1).subtract(CR.valueOf(Z.ONE.shiftLeft(2L * k)).inverse()).multiply(k - 1).divide(k + 1).multiply(Binomial.binomial(2L * k, k)).getApprox(precision);
          if (v.isZero()) {
            return sum;
          }
          sum = sum.signedAdd((k & 1) == 0, v);
        }
      }
    }.multiply(CR.HALF).subtract(CR.TWO.divide(CR.FIVE.sqrt())).subtract(CR.SEVEN.divide(CR.SQRT2.multiply(2))).add(new Q(7, 2));
  }

  /** Construct the sequence. */
  public A074904() {
    super(0, build());
  }
}

