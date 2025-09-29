package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388154 Decimal expansion of Gamma(3/4)^18 / Pi^(9/2).
 * @author Sean A. Irvine
 */
public class A388154 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388154() {
    super(0, CR.PI.pow(new Q(9, 2)).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(18)));
  }
}
