package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388644 Decimal expansion of (1/6) * exp(Pi / 3) * sqrt(Pi) * 3^(1/2) * Gamma(11/12) * sqrt(2) * (3^(1/2)-1) / Gamma(2/3) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388644 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388644() {
    super(0, CR.PI.divide(3).exp().divide(6).multiply(CR.SQRT_PI).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
