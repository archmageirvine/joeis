package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388870 Decimal expansion of (1/6) * exp(Pi / 3) * Pi^(5/4) * 3^(1/2) * Gamma(11/12) * sqrt(2) * (3^(1/2)-1) / Gamma(2/3) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388870 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388870() {
    super(1, CR.PI.divide(3).exp().divide(6).multiply(CR.PI.pow(new Q(5, 4))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
