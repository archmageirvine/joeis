package irvine.oeis.a188;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.PositionSequence;

/**
 * A188290 Positions of 0 in the zero-one sequence [nr+4r]-[nr]-[4r], where r=sqrt(5) and []=floor.
 * @author Georg Fischer
 */
public class A188290 extends PositionSequence {

  /** Construct the sequence. */
  public A188290() {
    super(1, new A188374(4, CR.FIVE.sqrt()), 0);
  }
}
