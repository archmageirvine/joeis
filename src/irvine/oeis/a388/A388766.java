package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388766 Decimal expansion of (sqrt(-8+14 / sqrt(3)) * Pi^2 * exp(Pi)) / (Gamma(-1/3)^2 * Gamma(7/12)^2 * Gamma(3/4)^2).
 * @author Sean A. Irvine
 */
public class A388766 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388766() {
    super(1, CR.PI.exp().divide(54).multiply(CR.PI.square()).multiply(CR.SQRT2).multiply(CR.THREE.pow(new Q(3, 4))).multiply(CR.THREE.sqrt().subtract(1).square()).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).square()).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
