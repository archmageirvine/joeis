package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388603 Decimal expansion of -((sqrt(3 * (2+sqrt(3))) * Gamma(2/3)) / (Gamma(-1/4) * Gamma(11/12))).
 * @author Sean A. Irvine
 */
public class A388603 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388603() {
    super(0, CR.THREE.sqrt().divide(8).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CR.SQRT2).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(11, 12))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
