package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388620 Decimal expansion of 2 * Gamma(3/4)^5 / Pi^(5/4).
 * @author Sean A. Irvine
 */
public class A388620 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388620() {
    super(1, CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5).multiply(2).divide(CR.PI.pow(new Q(5, 4))));
  }
}
