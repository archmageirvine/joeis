package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388947 Decimal expansion of (3^(1/4) * exp(-Pi/8) * ((1+sqrt(3)) * Gamma(7/12) * Gamma(2/3))^(2/3) * Gamma(3/4)^(1/3)) / (2^(5/8) * Pi^(7/12)).
 * @author Sean A. Irvine
 */
public class A388947 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388947() {
    super(1, CR.PI.divide(-8).exp().multiply(CR.TWO.pow(new Q(3, 8))).multiply(CR.THREE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(Q.ONE_THIRD)).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).pow(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(2, 3))).divide(CR.PI.pow(new Q(7, 12))));
  }
}
