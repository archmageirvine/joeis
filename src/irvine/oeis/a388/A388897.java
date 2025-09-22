package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388897 Decimal expansion of (1/6) * exp(5*Pi/12) * sqrt(Pi) * 3^(1/4) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388897 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388897() {
    super(0, CR.PI.multiply(new Q(5, 12)).exp().divide(6).multiply(CR.SQRT_PI).multiply(CR.THREE.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
