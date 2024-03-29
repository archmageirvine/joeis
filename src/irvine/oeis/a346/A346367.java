package irvine.oeis.a346;
// Generated by gen_seq4.pl decexp at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346367 Decimal expansion of (1 - gamma)*zeta(2), where gamma is Euler's constant (or the Euler-Mascheroni constant).
 * Formula: (1-gamma)*zeta(2)
 * @author Georg Fischer
 */
public class A346367 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346367() {
    super(0, CR.ONE.subtract(CR.GAMMA).multiply(Zeta.zeta(2)));
  }
}
