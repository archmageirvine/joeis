package irvine.oeis.a363;
// Generated by gen_seq4.pl robot/lingf at 2023-07-13 13:55

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A363256 Number of length n strings on the alphabet {0,1,2,3} with digit sum at most 4.
 * @author Georg Fischer
 */
public class A363256 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A363256() {
    super(0, "[1,-1,3,-3,1]", "[1,-5,10,-10,5,-1]");
  }
}
