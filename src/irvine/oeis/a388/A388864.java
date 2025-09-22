package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388864 Decimal expansion of (1/8) * 2^(5/16) * Gamma(5/8)^3 * (2+sqrt(2))^(3/2) / (2-sqrt(2))^(1/4) / Gamma(7/8)^3 / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A388864 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388864() {
    super(1, CR.TWO.pow(new Q(-43, 16)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).divide(CR.TWO.subtract(CR.SQRT2).pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
