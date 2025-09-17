package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388386 Decimal expansion of (1/32) * exp(5*Pi/8) * 2^(5/16) * Gamma(5/8)^4 * (3+2 * sqrt(2)) / (sqrt(2) * (2+sqrt(2))^(1/2))^(1/2) / Pi / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A388386 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388386() {
    super(0, CR.PI.multiply(new Q(5, 8)).exp().divide(32).multiply(CR.TWO.pow(new Q(5, 16))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.TWO.multiply(CR.SQRT2))).divide(CR.SQRT2.multiply(CR.TWO.add(CR.SQRT2).sqrt()).sqrt()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
