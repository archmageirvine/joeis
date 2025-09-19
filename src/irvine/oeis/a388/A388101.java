package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388101 Decimal expansion of (1/2) * exp(Pi/12) * Pi^(1/2) * 2^(1/4) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388101 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388101() {
    super(0, CR.PI.divide(12).exp().divide(2).multiply(CR.PI.sqrt()).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
