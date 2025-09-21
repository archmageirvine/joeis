package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388691 Decimal expansion of (1/32768) * exp(21*Pi/8) * 2^(5/8) * Gamma(5/8)^7 * (2+sqrt(2))^(3/2) / Pi^(7/4) / Gamma(7/8)^7.
 * @author Sean A. Irvine
 */
public class A388691 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388691() {
    super(1, CR.PI.multiply(new Q(21, 8)).exp().divide(32768).multiply(CR.TWO.pow(new Q(5, 8))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(7)).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).divide(CR.PI.pow(new Q(7, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(7)));
  }
}
