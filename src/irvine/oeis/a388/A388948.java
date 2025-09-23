package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388948 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388948 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388948() {
    super(1, CR.PI.exp().divide(32).multiply(CR.PI.pow(new Q(5, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
