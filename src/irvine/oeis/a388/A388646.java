package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388646 Decimal expansion of Gamma(3/4) * sqrt(2 * Pi) * (3^(1/2)-1) / Gamma(7/12) / Gamma(2/3).
 * @author Sean A. Irvine
 */
public class A388646 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388646() {
    super(1, CrFunctions.GAMMA.cr(new Q(3, 4)).multiply(CR.TAU.sqrt()).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(7, 12))).divide(CrFunctions.GAMMA.cr(new Q(2, 3))));
  }
}
