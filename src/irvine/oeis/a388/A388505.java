package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388505 Decimal expansion of (99/256) * Gamma(7/12)^(17/4) * exp(Pi / 24) * 3^(3/8) * (3^(1/2)+19/11) * 2^(1/8) * Gamma(2/3)^(21/2) / (sqrt(2) * (3^(1/2)-1))^(1/4) / Pi^(19/4) / Gamma(11/12)^(25/4).
 * @author Sean A. Irvine
 */
public class A388505 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388505() {
    super(1, CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(17, 4)).multiply(new Q(99, 256)).multiply(CR.PI.divide(24).exp()).multiply(CR.THREE.pow(new Q(3, 8))).multiply(CR.THREE.sqrt().add(new Q(19, 11))).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(21, 2))).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).pow(Q.ONE_QUARTER)).divide(CR.PI.pow(new Q(19, 4))).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(25, 4))));
  }
}
