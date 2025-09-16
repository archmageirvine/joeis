package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388174 Decimal expansion of (15/4) * exp(3/4 * Pi) * Pi^(7/4) * 2^(1/4) / Gamma(3/4)^7.
 * @author Sean A. Irvine
 */
public class A388174 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388174() {
    super(1, CR.PI.multiply(new Q(3, 4)).exp().multiply(new Q(15, 4)).multiply(CR.PI.pow(new Q(7, 4))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
