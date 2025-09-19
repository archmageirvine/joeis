package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388614 Decimal expansion of (1/12) * exp(Pi / 24) * 2^(3/4) * Gamma(2/3) * 3^(3/4) * (1+3^(1/2)) / Pi^(1/4) / Gamma(11/12).
 * @author Sean A. Irvine
 */
public class A388614 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388614() {
    super(0, CR.PI.divide(24).exp().divide(12).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CR.THREE.pow(new Q(3, 4))).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(11, 12))));
  }
}
