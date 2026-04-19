package irvine.oeis.a084;

import irvine.oeis.FilterPositionSequence;

/**
 * A084464 Positions of odd juggling states in A084457, i.e., positions of nonzero-throws in A084458 - 1.
 * @author Sean A. Irvine
 */
public class A084464 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084464() {
    super(1, 0, new A084457(), ODD);
  }
}
