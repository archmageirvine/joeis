package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388597 Decimal expansion of -9 * sqrt(Pi) * 2^(1/3) * 3^(1/2) * Gamma(11/12)^2 * (-2+3^(1/2)) * exp(-Pi / 2) / Gamma(3/4)^2 / Gamma(5/6).
 * @author Sean A. Irvine
 */
public class A388597 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388597() {
    super(1, CR.SQRT_PI.multiply(-9).multiply(CR.TWO.pow(Q.ONE_THIRD)).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CR.THREE.sqrt().subtract(2)).multiply(CR.HALF_PI.negate().exp()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CrFunctions.GAMMA.cr(new Q(5, 6))));
  }
}
