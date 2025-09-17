package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388369 Decimal expansion of 256 * exp(-11*Pi/12) * 2^(1/4) * Gamma(3/4)^22 / Pi^(11/2).
 * @author Sean A. Irvine
 */
public class A388369 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388369() {
    super(1, CR.PI.multiply(new Q(-11, 12)).exp().multiply(256).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(22)).divide(CR.PI.pow(new Q(11, 2))));
  }
}
