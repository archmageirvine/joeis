package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388689 Decimal expansion of (1/3) * Pi * 3^(1/2) * sqrt(2) * (3^(1/2)-1) / Gamma(7/12) / Gamma(2/3) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388689 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388689() {
    super(0, CR.PI.divide(CR.THREE.sqrt()).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(7, 12))).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
