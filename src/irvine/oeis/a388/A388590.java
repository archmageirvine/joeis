package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388590 Decimal expansion of ((-1+sqrt(3)) * Pi * exp(Pi / 3) * Gamma(11/12)) / (sqrt(6) * Gamma(2/3) * Gamma(3/4)^3).
 * @author Sean A. Irvine
 */
public class A388590 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388590() {
    super(1, CR.PI.divide(3).exp().divide(6).multiply(CR.PI).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
