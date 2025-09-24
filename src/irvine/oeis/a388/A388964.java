package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388964 Decimal expansion of -(1/8) * exp(-Pi / 4) * 2^(3/4) * Gamma(5/8)^4 * (3+2 * sqrt(2)) / (sqrt(2)-2) / Pi / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A388964 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388964() {
    super(0, CR.PI.divide(-4).exp().divide(-8).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).divide(CR.SQRT2.subtract(2)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
