package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388898 Decimal expansion of (1/64) * exp(7*Pi/8) / Pi * 2^(1/8) * Gamma(5/8)^4 * (3+2 * sqrt(2)) * (2-sqrt(2))^(1/2) / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A388898 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388898() {
    super(1, CR.PI.multiply(new Q(7, 8)).exp().divide(64).divide(CR.PI).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
