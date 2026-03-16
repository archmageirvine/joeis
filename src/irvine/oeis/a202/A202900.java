package irvine.oeis.a202;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A202900 Number of n X 2 0..1 arrays with every one equal to some NW, E or S neighbor.
 * @author Georg Fischer
 */
public class A202900 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A202900() {
    super(0, "[1,-3,4,-2]", "[1,-4,4,-4,4]");
  }
}
