package irvine.oeis.a188;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.FilterPositionSequence;

/**
 * A188219 Positions of 0 in the zero-one sequence [n*r]-[4*r]-[n*r-4*r], where r=sqrt(5), n&gt;=1.
 * @author Georg Fischer
 */
public class A188219 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A188219() {
    super(1, new A188192(4, CR.FIVE.sqrt()), 0);
  }
}
