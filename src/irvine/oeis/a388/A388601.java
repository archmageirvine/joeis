package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388601 Decimal expansion of (1/2) * exp(-Pi/24) * Pi^(1/4) * 2^(7/8) * sqrt(2) * (3^(1/2)-1) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388601 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388601() {
    super(0, CR.PI.divide(-24).exp().multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.pow(new Q(-1, 8))).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
