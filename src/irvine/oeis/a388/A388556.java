package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388556 Decimal expansion of (128 * sqrt(7+5 * sqrt(2)) * exp(Pi / 2) * Gamma(5/4)^4 * sin(Pi / 8)^4) / Pi^3.
 * @author Sean A. Irvine
 */
public class A388556 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388556() {
    super(1, CR.HALF_PI.exp().divide(32).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)).divide(CR.PI));
  }
}
