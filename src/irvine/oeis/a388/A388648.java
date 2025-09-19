package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388648 Decimal expansion of (1/2) * exp(-Pi/8) * 2^(1/8) * Gamma(2/3) * Gamma(7/12) * (1+3^(1/2)) / Gamma(3/4) / sqrt(Pi).
 * @author Sean A. Irvine
 */
public class A388648 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388648() {
    super(0, CR.PI.divide(-8).exp().multiply(CR.TWO.pow(new Q(-7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.SQRT_PI));
  }
}
