package irvine.oeis.a083;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A083648 Decimal expansion of Sum_{n&gt;=1} -(-1)^n/n^n = Integral_{x=0..1} x^x dx.
 * @author Sean A. Irvine
 */
public class A083648 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A083648() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        long k = 0;
        while (true) {
          final Z t = one.divide(Z.valueOf(++k).pow(k));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.signedAdd((k & 1) == 1, t);
        }
      }
    });
  }
}
