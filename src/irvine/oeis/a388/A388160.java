package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388160 Decimal expansion of Gamma(3/4)^24 / Pi^6.
 * @author Sean A. Irvine
 */
public class A388160 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388160() {
    super(0, CR.PI.pow(6).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(24)));
  }
}
