package irvine.oeis.a188;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.FilterPositionSequence;

/**
 * A188220 Positions of 1 in the zero-one sequence [n*r]-[5*r]-[n*r-5*r], where r=sqrt(5), n&gt;=1.
 * @author Georg Fischer
 */
public class A188220 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A188220() {
    super(1, new A188192(5, CR.FIVE.sqrt()), 1);
  }
}
