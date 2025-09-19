package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388384 Decimal expansion of 1/3 * exp(Pi / 4) * sqrt(Pi) * 3^(1/2) * Gamma(11/12) * (3^(1/2)-1) / Gamma(2/3) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388384 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388384() {
    super(1, CR.PI.divide(4).exp().divide(3).multiply(CR.SQRT_PI).multiply(CR.THREE.sqrt()).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.THREE.sqrt().subtract(1)));
  }
}
