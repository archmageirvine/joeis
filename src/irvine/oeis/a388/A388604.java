package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388604 Decimal expansion of ((-1+sqrt(3)) * Gamma(-1/12) * Gamma(3/4)) / (sqrt(6) * Gamma(-1/3)).
 * @author Sean A. Irvine
 */
public class A388604 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388604() {
    super(1, CR.THREE.sqrt().multiply(new Q(2, 3)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))));
  }
}
