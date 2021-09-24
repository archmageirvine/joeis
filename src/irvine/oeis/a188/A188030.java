package irvine.oeis.a188;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.PositionSequence;

/**
 * A188030 Positions of 1 in the zero-one sequence given by [nr]-[nr-10r]-[10r], where r=(1+sqrt(5))/2, [ ]=floor, n&gt;=1.
 * @author Georg Fischer
 */
public class A188030 extends PositionSequence {

  /** Construct the sequence. */
  public A188030() {
    super(1, new A188192(10, CR.PHI), 1);
  }
}
