package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388399 Decimal expansion of (8*2^(15/16) * (2+sqrt(2))^(5/4) * exp(Pi / 2) * Gamma(5/4)^3 * sin(Pi / 8)^3) / Pi^(9/4).
 * @author Sean A. Irvine
 */
public class A388399 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388399() {
    super(1, CR.HALF_PI.exp().divide(32).multiply(CR.TWO.pow(new Q(15, 16))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).divide(CR.SQRT2.multiply(CR.TWO.add(CR.SQRT2).sqrt()).sqrt()).divide(CR.PI.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)));
  }
}
