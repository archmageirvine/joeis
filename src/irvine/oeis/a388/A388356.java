package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388356 Decimal expansion of 8 * exp(-3*Pi/8) * 2^(3/8) * Gamma(3/4)^9 / Pi^(9/4).
 * @author Sean A. Irvine
 */
public class A388356 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388356() {
    super(1, CR.PI.multiply(new Q(-3, 8)).exp().multiply(8).multiply(CR.TWO.pow(new Q(3, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(9)).divide(CR.PI.pow(new Q(9, 4))));
  }
}
