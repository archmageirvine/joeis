package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388519 Decimal expansion of (3/2) * Gamma(2/3)^2 * Gamma(7/12)^2 * (2+3^(1/2)) * exp(-Pi / 2) / Pi / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388519 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388519() {
    super(1, CrFunctions.GAMMA.cr(new Q(2, 3)).square().multiply(new Q(3, 2)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).square()).multiply(CR.TWO.add(CR.THREE.sqrt())).multiply(CR.HALF_PI.negate().exp()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
