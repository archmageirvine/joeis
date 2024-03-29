package irvine.oeis.a187;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A187990 Number of nondecreasing arrangements of 6 numbers x(i) in -(n+4)..(n+4) with the sum of sign(x(i))*2^|x(i)| zero.
 * @author Georg Fischer
 */
public class A187990 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A187990() {
    super(0, "[67,-151,115,-30]", "[1,-4,6,-4,1]");
  }
}
