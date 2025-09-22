package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388901 Decimal expansion of (1/4) * exp(-Pi/8) * 2^(1/4) * 3^(1/2) * Gamma(2/3) * (1+3^(1/2)) / Gamma(11/12) / Pi^(1/4).
 * @author Sean A. Irvine
 */
public class A388901 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388901() {
    super(0, CR.PI.divide(-8).exp().divide(4).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(11, 12))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
