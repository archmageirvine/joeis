package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388193 Decimal expansion of (1/4) * exp(3/8 * Pi) * Pi^(3/4) * 2^(1/8) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388193 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388193() {
    super(1, CR.PI.multiply(new Q(3, 8)).exp().divide(4).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
