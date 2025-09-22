package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388835 Decimal expansion of 2^(3/8) * Gamma(3/4)^2 / sqrt(Pi).
 * @author Sean A. Irvine
 */
public class A388835 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388835() {
    super(1, CR.TWO.pow(new Q(3, 8)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CR.SQRT_PI));
  }
}
