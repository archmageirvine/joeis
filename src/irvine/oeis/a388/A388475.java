package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388475 Decimal expansion of ((Pi / 2)^(1/4) * exp(Pi / 4)) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388475 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388475() {
    super(1, CR.PI.divide(4).exp().divide(2).multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
