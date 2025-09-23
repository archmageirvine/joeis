package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388953 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388953 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388953() {
    super(1, CR.TWO.pow(new Q(5, 8)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
