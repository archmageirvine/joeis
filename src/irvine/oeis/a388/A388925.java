package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388925 Decimal expansion of ((-6+4 * sqrt(3)) * Pi * Gamma(11/12)^2) / (Gamma(2/3)^2 * Gamma(3/4)^2).
 * @author Sean A. Irvine
 */
public class A388925 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388925() {
    super(1, CR.TAU.multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CR.TWO.subtract(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
