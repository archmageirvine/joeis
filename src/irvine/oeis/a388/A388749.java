package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388749 Decimal expansion of (1/24) * exp(Pi / 2) * Pi * 3^(1/4) * Gamma(2/3) * Gamma(7/12) * (1+3^(1/2)) / Gamma(3/4)^7.
 * @author Sean A. Irvine
 */
public class A388749 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388749() {
    super(1, CR.HALF_PI.exp().divide(24).multiply(CR.PI).multiply(CR.THREE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
