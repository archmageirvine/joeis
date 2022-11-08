package irvine.oeis.a192;
// manually lingf at 2022-11-07 09:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A192306 1-sequence of reduction of (2n) by x^2 -&gt; x+1.
 * @author Georg Fischer
 */
public class A192306 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A192306() {
    super(1, "[0,0,4,-2]", "[1,-3,1,3,-1,-1]");
  }
}
