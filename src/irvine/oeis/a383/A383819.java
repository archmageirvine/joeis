package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055777;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383819 Decimal expansion of -Sum_{k&gt;=1} mu(3*k)/(27^k + 1), where mu is the M\u00f6bius function.
 * @author Sean A. Irvine
 */
public class A383819 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383819() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A055777().skip();
        Z sum = Z.ZERO;
        int k = 0;
        while (true) {
          final Z t = CR.ONE.divide(s.next()).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          final Z u =CR.TWO.divide(Z.THREE.pow(Z.THREE.pow(++k).multiply2())).getApprox(precision);
          sum = sum.add(t).subtract(u);
        }
      }
    });
  }
}

