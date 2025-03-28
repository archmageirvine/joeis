package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-28.ack/lingf at 2025-03-28 22:47

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A381289 Number of subsets of 6 integers between 1 and n such that their sum is 0 modulo n.
 * @author Georg Fischer
 */
public class A381289 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A381289() {
    super(7, "[0,0,0,0,0,0,0,1,1,3,0,2,4,1,-1,1]", "[1,-2,-1,3,1,-1,-4,3,3,-4,-1,1,3,-1,-2,1]");
  }
}
