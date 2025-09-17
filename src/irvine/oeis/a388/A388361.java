package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388361 Decimal expansion of 32 * exp(-7*Pi/12) * 2^(1/4) * Gamma(3/4)^14 / Pi^(7/2).
 * @author Sean A. Irvine
 */
public class A388361 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388361() {
    super(1, CR.PI.multiply(new Q(-7, 12)).exp().multiply(32).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(14)).divide(CR.PI.pow(new Q(7, 2))));
  }
}
