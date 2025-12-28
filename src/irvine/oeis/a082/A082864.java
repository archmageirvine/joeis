package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A082864 Decimal expansion of (-1)*c(2) where, in a neighborhood of zero, Gamma(x) = 1/x + c(0) + c(1)*x + c(2)*x^2 + ... (Gamma(x) denotes the Gamma function).
 * @author Sean A. Irvine
 */
public class A082864 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A082864() {
    super(0, CR.GAMMA.pow(3).subtract(CR.GAMMA.multiply(Zeta.zeta(2)).multiply(3)).add(Zeta.zeta(3)).divide(6).negate());
  }
}
