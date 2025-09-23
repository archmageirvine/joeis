package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388954 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388954 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388954() {
    super(0, CR.PI.divide(-4).exp().multiply(2).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CR.SQRT_PI));
  }
}
