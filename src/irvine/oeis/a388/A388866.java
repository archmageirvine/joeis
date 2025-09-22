package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388866 Decimal expansion of (1/32) * exp(3*Pi/4) * 2^(1/4) * Gamma(5/8)^3 * (1+sqrt(2)) / Gamma(7/8)^3 / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A388866 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388866() {
    super(0, CR.PI.multiply(new Q(3, 4)).exp().divide(32).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.ONE.add(CR.SQRT2)).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
