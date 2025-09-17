package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388367 Decimal expansion of 128 * exp(-5*Pi/6) * sqrt(2) * Gamma(3/4)^20 / Pi^5.
 * @author Sean A. Irvine
 */
public class A388367 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388367() {
    super(1, CR.PI.multiply(new Q(-5, 6)).exp().multiply(128).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(20)).divide(CR.PI.pow(5)));
  }
}
