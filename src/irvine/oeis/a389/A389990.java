package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389990 allocated for Marc Morgenegg.
 * @author Sean A. Irvine
 */
public class A389990 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389990() {
    super(1, CR.TAU.sqrt().divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}

