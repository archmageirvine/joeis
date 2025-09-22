package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388833 Decimal expansion of (1/16) * Gamma(2/3)^2 * sqrt(2) * 3^(1/4) * (1+3^(1/2))^2 / Gamma(11/12)^2 / Gamma(3/4) / Pi^(1/4).
 * @author Sean A. Irvine
 */
public class A388833 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388833() {
    super(0, CrFunctions.GAMMA.cr(new Q(2, 3)).square().divide(16).multiply(CR.SQRT2).multiply(CR.THREE.pow(Q.ONE_QUARTER)).multiply(CR.ONE.add(CR.THREE.sqrt()).square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
