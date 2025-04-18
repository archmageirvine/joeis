package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-28.ack/lingf at 2025-03-28 22:47

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A381291 Number of subsets of 8 integers between 1 and n such that their sum is 0 modulo n.
 * @author Georg Fischer
 */
public class A381291 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A381291() {
    super(9, "[0,0,0,0,0,0,0,0,0,1,1,-1,7,-4,6,4,-4,3,5,-3,1]", "[1,-4,4,4,-11,8,0,-8,10,0,-8,0,10,-8,0,8,-11,4,4,-4,1]");
  }
}
