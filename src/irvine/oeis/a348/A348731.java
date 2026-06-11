package irvine.oeis.a348;
// manually equa/decexp at 2026-06-10 15:06

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A348731 Decimal expansion of Integral_{x=0..1} x*log(x)/(1+x+x^2) dx (negated).
 * Formula:
 * @author Georg Fischer
 */
public class A348731 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A348731() {
    super(0, CR.PI.square().divide(CR.valueOf(54)).subtract(Zeta.zetaHurwitz(2, CR.TWO.divide(CR.THREE)).divide(CR.NINE)));
    next();
    next();
  }
}
