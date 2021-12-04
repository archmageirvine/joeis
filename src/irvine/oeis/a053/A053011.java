package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003285;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A053011 Decimal expansion of real number whose continued fraction is defined by property that k-th partial quotient is the period length of the continued fraction for sqrt(k).
 * @author Sean A. Irvine
 */
public class A053011 extends DecimalExpansionSequence {

  private static final int EXTRA_PRECISION = 5;

  /** Construct the sequence. */
  public A053011() {
    super(new CR() {

      private Z mH0 = Z.ZERO;
      private Z mK0 = Z.ONE;
      private Z mH1 = Z.ONE;
      private Z mK1 = Z.ZERO;
      private final Sequence mCf = new A003285();

      private void step() {
        final Z a = mCf.next();
        final Z h = a.multiply(mH1).add(mH0);
        final Z k = a.multiply(mK1).add(mK0);
        mH0 = mH1;
        mK0 = mK1;
        mH1 = h;
        mK1 = k;
      }

      @Override
      protected Z approximate(final int precision) {
        final int workingPrecision = precision - EXTRA_PRECISION;
        Z prev = Z.ZERO;
        while (true) {
          step();
          final CR z = CR.valueOf(new Q(mH1, mK1));
          final Z zz = z.getApprox(workingPrecision);
          if (zz.equals(prev)) {
            return scale(zz, -EXTRA_PRECISION);
          }
          prev = zz;
        }
      }
    });
  }
}
