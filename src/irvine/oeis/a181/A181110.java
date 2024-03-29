package irvine.oeis.a181;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A181110 Decimal expansion of 1/zeta(2) - 1/e^gamma, where gamma is the Euler-Mascheroni constant and zeta(2) = Pi^2/6.
 * Formula: 1/zeta(2)-1/e^gamma
 * @author Georg Fischer
 */
public class A181110 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A181110() {
    super(0, CR.ONE.divide(Zeta.zeta(2)).subtract(CR.ONE.divide(CR.E.pow(CR.GAMMA))));
  }
}
