package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388595 Decimal expansion of (sqrt(29+41 / sqrt(2)) * Gamma(5/8)^4) / (8 * Pi * Gamma(7/8)^4).
 * @author Sean A. Irvine
 */
public class A388595 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388595() {
    super(0, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4).divide(16).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
