package irvine.oeis.a287;
// manually posins at 2021-09-21 20:57

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a053.A053838;

/**
 * A287437 Positions of 2 in A053838.
 * @author Georg Fischer
 */
public class A287437 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A287437() {
    super(1, new A053838(), 2); // offset 0 would have been correct
  }
}
