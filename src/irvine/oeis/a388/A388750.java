package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388750 Decimal expansion of (32 * sqrt(82+58 * sqrt(2)) * exp(Pi / 2) * Gamma(5/4)^4 * sin(Pi / 8)^4) / Pi^3.
 * @author Sean A. Irvine
 */
public class A388750 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388750() {
    super(0, CR.HALF_PI.exp().divide(64).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
