package irvine.oeis.a065;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a047.A047356;

/**
 * A065450 Make an infinite chessboard from the squares in the first quadrant; sequence gives number of squares a knight can reach in n moves starting at the origin.
 * @author Sean A. Irvine
 */
public class A065450 extends PrependSequence {

  /** Construct the sequence. */
  public A065450() {
    super(1, new PartialSumSequence(new A047356()).skip(3), 1, 2, 10);
  }
}
