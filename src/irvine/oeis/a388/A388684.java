package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388684 Decimal expansion of (1/6) * Gamma(2/3)^2 * Gamma(7/12) * (1+3^(1/2))^2 / Pi / Gamma(11/12).
 * @author Sean A. Irvine
 */
public class A388684 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388684() {
    super(1, CrFunctions.GAMMA.cr(new Q(2, 3)).square().divide(6).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.ONE.add(CR.THREE.sqrt()).square()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(11, 12))));
  }
}
