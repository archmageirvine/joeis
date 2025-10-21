package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388002 Decimal expansion of Sum_{k&gt;=2} 1/(k^10-1).
 * @author Sean A. Irvine
 */
public class A388002 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388002() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int k = 0;
        while (true) {
          final Z t = Zeta.zeta(10 * ++k).subtract(1).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
