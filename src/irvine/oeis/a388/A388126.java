package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388126 Decimal expansion of Gamma(3/4)^11 / Pi^(11/4).
 * @author Sean A. Irvine
 */
public class A388126 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388126() {
    super(0, CR.PI.pow(new Q(11, 4)).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(11)));
  }
}
