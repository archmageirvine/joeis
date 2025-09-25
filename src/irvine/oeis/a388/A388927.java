package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388927 Decimal expansion of (4*6^(1/3) * Pi^(2/3) * Gamma(3/4)^(26/3) * ((1+sqrt(3)) / Gamma(11/12))^(11/3)) / ((114+66 * sqrt(3)) * Gamma(7/12)^5 * Gamma(2/3)^(4/3)).
 * @author Sean A. Irvine
 */
public class A388927 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388927() {
    super(1, CR.PI.pow(new Q(2, 3)).multiply(CR.THREE.pow(Q.ONE_THIRD)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(26, 3))).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(11, 3))).multiply(CR.SQRT2).divide(CR.THREE.sqrt().multiply(66).add(114)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(5)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(4, 3))).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(11, 3))));
  }
}
