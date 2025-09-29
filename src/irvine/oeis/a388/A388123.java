package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388123 Decimal expansion of Gamma(3/4)^8 / Pi^2.
 * @author Sean A. Irvine
 */
public class A388123 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388123() {
    super(0, CR.PI.square().inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
