package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388920 Decimal expansion of Pi^(1/4) * 2^(1/8) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388920 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388920() {
    super(1, CR.PI.pow(Q.ONE_QUARTER).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
