package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388952 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388952 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388952() {
    super(1, CR.HALF_PI.negate().exp().multiply(8).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).divide(CR.PI));
  }
}
