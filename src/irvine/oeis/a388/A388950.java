package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388950 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388950 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388950() {
    super(1, CR.PI.divide(-4).exp().multiply(2).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CR.SQRT_PI));
  }
}
