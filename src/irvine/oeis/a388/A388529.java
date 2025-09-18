package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388529 Decimal expansion of (1/64) * 3^(3/4) * Gamma(2/3)^3 * Gamma(7/12)^3 * (1+3^(1/2))^3 / Gamma(3/4)^9.
 * @author Sean A. Irvine
 */
public class A388529 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388529() {
    super(1, CrFunctions.GAMMA.cr(new Q(2, 3)).pow(3).divide(64).multiply(CR.THREE.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CR.ONE.add(CR.THREE.sqrt()).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(9)));
  }
}
