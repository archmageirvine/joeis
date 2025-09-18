package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388451 Decimal expansion of (3/4) * Gamma(2/3)^2 * Gamma(11/12) * Gamma(7/12)^3 * (2+3^(1/2)) * exp(-Pi/3) / Pi / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388451 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388451() {
    super(0, CrFunctions.GAMMA.cr(new Q(2, 3)).square().multiply(new Q(3, 4)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CR.TWO.add(CR.THREE.sqrt())).multiply(CR.PI.divide(-3).exp()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
