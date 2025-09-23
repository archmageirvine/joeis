package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388926 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388926 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388926() {
    super(0, CR.PI.divide(3).exp().divide(4).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
