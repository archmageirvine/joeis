package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388738 Decimal expansion of (1/3) * exp(Pi / 2) * Pi^(5/2) * 3^(3/4) / Gamma(11/12)^5 / Gamma(7/12)^5.
 * @author Sean A. Irvine
 */
public class A388738 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388738() {
    super(1, CR.HALF_PI.exp().divide(3).multiply(CR.PI.pow(new Q(5, 2))).multiply(CR.THREE.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(5)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(5)));
  }
}
