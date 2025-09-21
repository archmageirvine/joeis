package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388698 Decimal expansion of -3 * exp(-Pi) * Gamma(2/3)^4 * Gamma(7/12)^2 * (2+3^(1/2)) / (-2+3^(1/2)) / Pi^2 / Gamma(11/12)^2.
 * @author Sean A. Irvine
 */
public class A388698 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388698() {
    super(1, CR.PI.negate().exp().multiply(-3).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).square()).multiply(CR.TWO.add(CR.THREE.sqrt())).divide(CR.THREE.sqrt().subtract(2)).divide(CR.PI.square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()));
  }
}
