package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388374 Decimal expansion of (1/256) * 3^(1/2) * Gamma(2/3) * Gamma(5/8)^8 * Gamma(11/12)^2 * Gamma(7/12)^3 * (17+12 * sqrt(2)) * (1+3^(1/2)) * sqrt(2) * (2+sqrt(2))^(1/2) / Pi^(15/4) / Gamma(7/8)^8.
 * @author Sean A. Irvine
 */
public class A388374 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388374() {
    super(1, CR.THREE.sqrt().add(1).multiply(CR.SQRT2.add(1)).sqrt().multiply(CrFunctions.GAMMA.cr(Q.ONE_QUARTER).pow(3)).divide(CR.PI.pow(new Q(9, 4)).multiply(CR.THREE.pow(new Q(3, 8)).multiply(CR.TWO.pow(new Q(5, 2))))));
  }
}
