package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388906 Decimal expansion of (1/24) * exp(5*Pi/6) * 3^(1/4) * Pi^(3/2) * sqrt(2) * (3^(1/2)-1) / Gamma(7/12) / Gamma(2/3) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388906 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388906() {
    super(1, CR.PI.multiply(new Q(5, 6)).exp().divide(24).multiply(CR.THREE.pow(Q.ONE_QUARTER)).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(7, 12))).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
