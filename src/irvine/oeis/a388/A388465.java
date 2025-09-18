package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388465 Decimal expansion of 4096 * exp(-4*Pi/3) * Gamma(3/4)^32 / Pi^8.
 * @author Sean A. Irvine
 */
public class A388465 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388465() {
    super(1, CR.PI.multiply(new Q(-4, 3)).exp().multiply(4096).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(32)).divide(CR.PI.pow(8)));
  }
}
