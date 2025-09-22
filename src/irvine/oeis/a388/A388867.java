package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388867 Decimal expansion of (1/32) * exp(Pi / 4) * 2^(1/4) * Gamma(5/8)^3 * (2+sqrt(2))^2 / Gamma(7/8)^3 / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A388867 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388867() {
    super(0, CR.PI.divide(4).exp().divide(32).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.TWO.add(CR.SQRT2).square()).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
