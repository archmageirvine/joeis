package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388903 Decimal expansion of (1/64) * exp(5*Pi/8) * 2^(7/8) * Gamma(5/8)^4 * (3+2 * sqrt(2)) * (2-sqrt(2))^(1/2) / Gamma(7/8)^4 / Pi.
 * @author Sean A. Irvine
 */
public class A388903 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388903() {
    super(0, CR.PI.multiply(new Q(5, 8)).exp().divide(64).multiply(CR.TWO.pow(new Q(7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)).divide(CR.PI));
  }
}
