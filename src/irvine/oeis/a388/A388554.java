package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388554 Decimal expansion of (1/16) * 2^(3/4) * Gamma(5/8)^4 * (3+2 * sqrt(2)) * (2+sqrt(2))^(1/2) / Pi / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A388554 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388554() {
    super(1, CR.TWO.pow(new Q(3, 4)).divide(16).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
