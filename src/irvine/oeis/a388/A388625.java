package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388625 Decimal expansion of (1/64) * exp(3*Pi/4) * 2^(3/4) * Gamma(5/8)^4 * (2+sqrt(2)) / Pi / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A388625 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388625() {
    super(0, CR.PI.multiply(new Q(3, 4)).exp().divide(64).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.TWO.add(CR.SQRT2)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
