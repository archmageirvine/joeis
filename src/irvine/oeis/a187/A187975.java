package irvine.oeis.a187;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.PositionSequence;
import irvine.oeis.a188.A188374;

/**
 * A187975 Positions of 1 in the zero-one sequence given by s(n)=[nr+5r]-[nr]-[5r], where r=sqrt(2), n&gt;=1, [ ]=floor.
 * @author Georg Fischer
 */
public class A187975 extends PositionSequence {

  /** Construct the sequence. */
  public A187975() {
    super(1, new A188374(5, CR.SQRT2), 1);
  }
}
