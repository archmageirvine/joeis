package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A070860 Decimal expansion of (-1)*c(1) where, in a neighborhood of zero, Gamma(x) = 1/x + c(0) + c(1)*x + c(2)*x^2 + ... (Gamma(x) denotes the Gamma function).
 * @author Sean A. Irvine
 */
public class A070860 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A070860() {
    super(CR.GAMMA.multiply(CR.GAMMA).subtract(Zeta.zeta(2)).divide(CR.TWO).negate());
  }
}

