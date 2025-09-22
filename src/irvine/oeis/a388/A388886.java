package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388886 Decimal expansion of (1/64) * exp(Pi / 2) * Gamma(5/8)^4 * (3+2 * sqrt(2)) * sqrt(2) * (2+sqrt(2))^(1/2) / Pi / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A388886 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388886() {
    super(1, CR.HALF_PI.exp().divide(64).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
