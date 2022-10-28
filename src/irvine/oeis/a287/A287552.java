package irvine.oeis.a287;
// manually posins at 2021-09-23 21:28

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a053.A053839;

/**
 * A287552 Positions of 0 in A053839.
 * @author Georg Fischer
 */
public class A287552 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A287552() {
    super(1, new A053839(), 0);
  }
}
