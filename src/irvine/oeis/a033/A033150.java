package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A033150 Decimal expansion of Niven's constant.
 * @author Sean A. Irvine
 */
public class A033150 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A033150() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int opPrec = -precision;
        Z sum = Z.ONE.shiftLeft(opPrec);
        int k = 1;
        while (true) {
          final Z term = CR.ONE.subtract(Zeta.zeta(++k).inverse()).getApprox(-opPrec);
          if (term.isZero()) {
            break;
          }
          sum = sum.add(term);
        }
        return sum;
      }
    });
  }
}
