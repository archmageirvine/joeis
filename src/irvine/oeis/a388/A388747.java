package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388747 Decimal expansion of (exp(Pi / 6) * (-(((1+sqrt(3)) * Pi * Gamma(2/3)) / Gamma(-1/12)))^(1/3)) / (2^(1/6) * Gamma(3/4)^(5/3)).
 * @author Sean A. Irvine
 */
public class A388747 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388747() {
    super(1, CR.PI.divide(6).exp().divide(6).multiply(CR.PI.pow(Q.ONE_THIRD)).multiply(CR.THREE.pow(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(Q.ONE_THIRD)).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(5, 3))));
  }
}
