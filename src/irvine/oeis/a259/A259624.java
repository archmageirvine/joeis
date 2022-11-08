package irvine.oeis.a259;
// manually lingf at 2022-11-07 09:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A259624 Strictly increasing list of F - 1, F, and F + 1, where F = A000045, the Fibonacci numbers.
 * @author Georg Fischer
 */
public class A259624 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A259624() {
    super(1, "[0,0,1,3,6,8,9,9,8,6,3,2,1]", "[1,1,1,-1,-1,-1,-1,-1,-1]");
  }
}
