package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085361 Decimal expansion of the number c = Sum_{n&gt;=1} (zeta(n+1)-1)/n.
 * @author Sean A. Irvine
 */
public class A085361 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085361() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final Z t = Zeta.zeta(++k + 1).subtract(1).divide(k).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
