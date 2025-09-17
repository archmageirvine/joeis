package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388400 Decimal expansion of (1/32) * exp(Pi / 2) * 2^(3/16) * Gamma(5/8)^4 * (3+2 * sqrt(2)) / (2-sqrt(2))^(1/4) / Pi / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A388400 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388400() {
    super(1, CR.HALF_PI.exp().divide(32).multiply(CR.TWO.pow(new Q(3, 16))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.TWO.multiply(CR.SQRT2))).divide(CR.TWO.subtract(CR.SQRT2).pow(Q.ONE_QUARTER)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
