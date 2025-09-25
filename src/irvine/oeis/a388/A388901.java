package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388901 Decimal expansion of ((3+sqrt(3)) * (2 / Pi)^(1/4) * exp(-Pi/8) * Gamma(-1/3)) / Gamma(-1/12).
 * @author Sean A. Irvine
 */
public class A388901 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388901() {
    super(0, CR.PI.divide(-8).exp().divide(4).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(11, 12))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
