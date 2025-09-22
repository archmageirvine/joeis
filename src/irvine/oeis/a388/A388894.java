package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388894 Decimal expansion of (1/2) * exp(Pi / 8) * Pi^(5/4) * 2^(1/4) / Gamma(3/4)^5.
 * @author Sean A. Irvine
 */
public class A388894 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388894() {
    super(1, CR.PI.divide(8).exp().divide(2).multiply(CR.PI.pow(new Q(5, 4))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
