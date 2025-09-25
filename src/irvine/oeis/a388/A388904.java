package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388904 Decimal expansion of (128 * (4756+3363 * sqrt(2))^(1/4) * exp(Pi / 8) * Gamma(5/4)^4 * sin(Pi / 8)^4) / Pi^3.
 * @author Sean A. Irvine
 */
public class A388904 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388904() {
    super(0, CR.PI.divide(8).exp().divide(32).multiply(CR.TWO.pow(new Q(7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
