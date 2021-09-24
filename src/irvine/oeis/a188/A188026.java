package irvine.oeis.a188;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.PositionSequence;

/**
 * A188026 Positions of 0 in the zero-one sequence given by z(n)=[nr]-[nr-8r]-[8r], where r=(1+sqrt(5))/2, [ ]=floor, n&gt;=1.
 * @author Georg Fischer
 */
public class A188026 extends PositionSequence {

  /** Construct the sequence. */
  public A188026() {
    super(1, new A188192(8, CR.PHI), 0);
  }
}
