package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388834 Decimal expansion of (1/27) * exp(Pi) * Pi^(9/4) * 3^(3/4) * (3^(1/2)-1)^3 / Gamma(7/12)^3 / Gamma(2/3)^3.
 * @author Sean A. Irvine
 */
public class A388834 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388834() {
    super(1, CR.PI.exp().divide(27).multiply(CR.PI.pow(new Q(9, 4))).multiply(CR.THREE.pow(new Q(3, 4))).multiply(CR.THREE.sqrt().subtract(1).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(3)));
  }
}
