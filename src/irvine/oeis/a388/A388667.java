package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388667 Decimal expansion of 2 * exp(-Pi/8) * 2^(11/16) * Pi^(1/4) * Gamma(7/8) * (2-sqrt(2))^(1/2) / (sqrt(2) * (2+sqrt(2))^(1/2))^(1/2) / Gamma(5/8).
 * @author Sean A. Irvine
 */
public class A388667 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388667() {
    super(1, CR.PI.divide(-8).exp().multiply(CR.TWO.pow(new Q(27, 16))).multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(7, 8))).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CR.SQRT2.multiply(CR.TWO.add(CR.SQRT2).sqrt()).sqrt()).divide(CrFunctions.GAMMA.cr(new Q(5, 8))));
  }
}
