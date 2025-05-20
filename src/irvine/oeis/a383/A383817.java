package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055777;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383817 Decimal expansion of -Sum_{k&gt;=1} mu(3*k)/(3^k - 1), where mu is the M\u00f6bius function A008683.
 * @author Sean A. Irvine
 */
public class A383817 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383817() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A055777();
        Z sum = Z.ZERO;
        while (true) {
          final Z t = CR.ONE.divide(s.next()).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
