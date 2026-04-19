package irvine.oeis.a084;

import irvine.oeis.FilterPositionSequence;

/**
 * A084463 Positions of even juggling states in A084457, i.e., positions of zeros in A084458 - 1.
 * @author Sean A. Irvine
 */
public class A084463 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084463() {
    super(1, 0, new A084457(), EVEN);
  }
}
