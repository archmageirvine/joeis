package irvine.oeis.a261;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A261509 Decimal expansion of -Gamma'''(1).
 * Formula: gamma^3+gamma*Pi^2/2+2*zeta(3)
 * @author Georg Fischer
 */
public class A261509 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A261509() {
    super(1, CR.GAMMA.pow(CR.THREE).add(CR.GAMMA.multiply(CR.PI.pow(CR.TWO)).divide(CR.TWO)).add(CR.TWO.multiply(Zeta.zeta(3))));
  }
}
