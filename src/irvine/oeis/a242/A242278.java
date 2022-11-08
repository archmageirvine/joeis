package irvine.oeis.a242;
// manually lingf at 2022-11-07 09:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A242278 Number of non-palindromic n-tuples of 3 distinct elements.
 * @author Georg Fischer
 */
public class A242278 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A242278() {
    super(1, "[0,0,6]", "[1,-3,-3,9]");
  }
}
