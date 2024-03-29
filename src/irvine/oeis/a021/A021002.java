package irvine.oeis.a021;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A021002 Decimal expansion of zeta(2)*zeta(3)*zeta(4)*...
 * @author Sean A. Irvine
 */
public class A021002 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A021002() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int opPrec = -precision;
        Z prod = Z.ONE.shiftLeft(opPrec);
        int k = 1;
        while (true) {
          final Z zeta = Zeta.zeta(++k).getApprox(-opPrec);
          final Z prev = prod;
          prod = prod.multiply(zeta).shiftRight(opPrec);
          if (prod.equals(prev)) {
            break;
          }
        }
        return prod;
      }
    });
  }
}
