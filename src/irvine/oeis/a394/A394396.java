package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000182;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394396 Decimal expansion of (1/2)*Sum_{k&gt;=3} (k*tan(Pi/k)/Pi - 1).
 * @author Sean A. Irvine
 */
public class A394396 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394396() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence tangents = new A000182().skip();
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          ++k;
          final Z t = CR.PI.pow(2 * k).multiply(tangents.next()).divide(Functions.FACTORIAL.z(2 * k + 1)).multiply(Zeta.zeta(2 * k).subtract(1).subtract(CR.valueOf(Z.ONE.shiftLeft(2 * k)).inverse())).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.divide(CR.TWO));
  }
}
