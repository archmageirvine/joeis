package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388238 Decimal expansion of (12 * Pi^(7/4)) / (Gamma(-1/3)^2 * Gamma(7/12)^(5/2) * sqrt((1+sqrt(3)) * Gamma(11/12))).
 * @author Sean A. Irvine
 */
public class A388238 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388238() {
    super(1, CR.PI.pow(new Q(7, 4)).multiply(new Q(8, 3)).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).sqrt()).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(5, 2))).divide(CR.THREE.sqrt().subtract(1)).divide(CR.SQRT2.multiply(CR.THREE.sqrt().add(1)).pow(new Q(3, 2))));
  }
}
