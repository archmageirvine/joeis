package irvine.oeis.a350;
// Generated by gen_seq4.pl lingf at 2022-11-08 20:17

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A350551 Convolution of Jacobsthal numbers and Pell numbers.
 * @author Georg Fischer
 */
public class A350551 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A350551() {
    super(0, "[0,0,1]", "[1,-3,-1,5,2]");
  }
}
