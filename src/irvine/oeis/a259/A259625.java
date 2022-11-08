package irvine.oeis.a259;
// manually lingf at 2022-11-07 09:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A259625 List of numbers L - 1 and L, where L = A000032, the Lucas numbers, sorted into increasing order and duplicates removed.
 * @author Georg Fischer
 */
public class A259625 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A259625() {
    super(1, "[0,0,1,2,1,0,0,-1,-1,-1]", "[1,0,-2,0,0,0,1]");
  }
}
