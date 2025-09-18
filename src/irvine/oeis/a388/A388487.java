package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388487 Decimal expansion of -(1/8) * Gamma(5/8)^4 * (3+2 * sqrt(2)) / (sqrt(2)-2) / Pi / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A388487 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388487() {
    super(1, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4).divide(-8).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).divide(CR.SQRT2.subtract(2)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
