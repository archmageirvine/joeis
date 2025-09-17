package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388396 Decimal expansion of (1/4194304) * exp(3 * Pi) * sqrt(2) * Gamma(5/8)^16 * (99+70 * sqrt(2)) / Pi^4 / Gamma(7/8)^16.
 * @author Sean A. Irvine
 */
public class A388396 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388396() {
    super(0, CR.PI.multiply(3).exp().divide(4194304).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(16)).multiply(CR.valueOf(99).add(CR.valueOf(70).multiply(CR.SQRT2))).divide(CR.PI.pow(4)).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(16)));
  }
}
