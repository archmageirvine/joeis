package irvine.oeis.a188;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.PositionSequence;

/**
 * A188220 Positions of 1 in the zero-one sequence [nr]-[5r]-[nr-5r], where r=sqrt(5), n&gt;=1.
 * @author Georg Fischer
 */
public class A188220 extends PositionSequence {

  /** Construct the sequence. */
  public A188220() {
    super(1, new A188192(5, CR.FIVE.sqrt()), 1);
  }
}
