package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388397 Decimal expansion of (24 * (3+2 * sqrt(3)) * Gamma(2/3)^2) / (Gamma(-1/12)^2 * Gamma(3/4)^2).
 * @author Sean A. Irvine
 */
public class A388397 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388397() {
    super(1, CrFunctions.GAMMA.cr(new Q(2, 3)).square().divide(12).multiply(CR.THREE.sqrt().multiply(CR.ONE.add(CR.THREE.sqrt()).square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square())));
  }
}
