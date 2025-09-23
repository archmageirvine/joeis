package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388951 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388951 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388951() {
    super(1, CR.PI.multiply(new Q(-3, 8)).exp().multiply(4).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
