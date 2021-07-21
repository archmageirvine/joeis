package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a006.A006206;

/**
 * A005596 Decimal expansion of Artin's constant Product_{p=prime} (1-1/(p^2-p)).
 * @author Sean A. Irvine
 */
public class A005596 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A005596() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int opPrec = -precision;
        Z prod = Z.ONE.shiftLeft(opPrec);
        final A006206 a = new A006206();
        a.next();
        int k = 1;
        while (true) {
          final Z zeta = Zeta.zeta(++k).pow(CR.valueOf(a.next())).getApprox(-opPrec);
          final Z prev = prod;
          prod = prod.multiply(zeta).shiftRight(opPrec);
          if (prod.equals(prev)) {
            break;
          }
        }
        return prod;
      }
    }.inverse());
  }
}
