package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A080729 Decimal expansion of the infinite product of zeta functions for even arguments.
 * @author Sean A. Irvine
 */
public class A080729 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A080729() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z prod = one;
        int k = 0;
        while (true) {
          k += 2;
          final Z z = Zeta.zeta(k).getApprox(precision);
          if (z.compareTo(one) <= 0) {
            return prod;
          }
          prod = prod.multiply(z).shiftRight(-precision);
        }
      }
    });
  }
}
