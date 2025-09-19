package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388585 Decimal expansion of (1/8) * exp(Pi/6) * Gamma(2/3) * Gamma(7/12) * sqrt(2) * (1+3^(1/2)) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388585 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388585() {
    super(0, CR.PI.multiply(new Q(1, 6)).exp().divide(8).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.SQRT2).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
