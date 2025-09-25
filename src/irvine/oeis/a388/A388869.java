package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388869 Decimal expansion of (4 * (-4+3 * sqrt(2))^(1/4) * exp((5 * Pi) / 8) * Gamma(5/4)^3) / Pi^(9/4).
 * @author Sean A. Irvine
 */
public class A388869 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388869() {
    super(1, CR.PI.multiply(new Q(5, 8)).exp().divide(16).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.ONE.add(CR.SQRT2)).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
