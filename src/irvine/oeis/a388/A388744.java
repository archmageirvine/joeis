package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388744 Decimal expansion of Pi / (2^(3/4) * Gamma(3/4)^4).
 * @author Sean A. Irvine
 */
public class A388744 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388744() {
    super(0, CR.HALF_PI.multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
