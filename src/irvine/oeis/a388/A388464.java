package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388464 Decimal expansion of 2048 * exp(-5*Pi/4) * 2^(1/4) * Gamma(3/4)^30 / Pi^(15/2).
 * @author Sean A. Irvine
 */
public class A388464 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388464() {
    super(1, CR.PI.multiply(new Q(-5, 4)).exp().multiply(2048).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(30)).divide(CR.PI.pow(new Q(15, 2))));
  }
}
