package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388125 Decimal expansion of Gamma(3/4)^10 / Pi^(5/2).
 * @author Sean A. Irvine
 */
public class A388125 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388125() {
    super(0, CR.PI.pow(new Q(5, 2)).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(10)));
  }
}
