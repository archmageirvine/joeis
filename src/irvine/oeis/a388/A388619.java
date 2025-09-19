package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388619 Decimal expansion of 4 * exp(-Pi / 4) / Pi^(5/4) * 2^(1/4) * Gamma(3/4)^5.
 * @author Sean A. Irvine
 */
public class A388619 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388619() {
    super(1, CR.PI.divide(-4).exp().multiply(4).divide(CR.PI.pow(new Q(5, 4))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
