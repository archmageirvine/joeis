package irvine.oeis.a211;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A211342 Decimal expansion of q between 0 and 1 maximizing Dedekind eta function eta(q) = q^(1/24) * Product_{n&gt;=1} (1 - q^n).
 * @author Sean A. Irvine
 */
public class A211342 extends DecimalExpansionSequence {

  private static final CR C = CR.valueOf(new Q(1, 24));
  /** Maximum eta value. */
  public static final CR ETA_CONSTANT = new UnaryCRFunction() {
    @Override
    public CR execute(final CR x) {
      return new CR() {
        @Override
        protected Z approximate(final int precision) {
          final Z one = scale(Z.ONE, -precision);
          final Z zx = x.getApprox(precision);
          Z sum = Z.ZERO;
          int k = 0;
          Z zxk = one;
          while (true) {
            zxk = scale(zxk.multiply(zx), precision);
            if (zxk.isZero()) {
              break;
            }
            final Z sigma = Jaguar.factor(++k).sigma();
            sum = sum.add(zxk.multiply(sigma));
          }
          return sum;
        }
      }.subtract(C);
    }
  }.inverseMonotone(CR.valueOf("0.02"), CR.valueOf("0.04")).execute(CR.ZERO);

  /** Construct the sequence. */
  public A211342() {
    super(0, ETA_CONSTANT);
  }
}
