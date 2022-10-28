package irvine.oeis.a287;
// manually posins at 2021-09-23 21:28

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a053.A053839;

/**
 * A287554 Positions of 2 in A053839.
 * @author Georg Fischer
 */
public class A287554 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A287554() {
    super(1, new A053839(), 2);
  }
}
