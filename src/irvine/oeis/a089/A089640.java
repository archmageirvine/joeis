package irvine.oeis.a089;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A089640 Enumeration of partial sums of 1 + [1,2] + [2,3] + [1,2] + [2,3] + ...
 * @author Georg Fischer
 */
public class A089640 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A089640() {
    super(1, "[0,1,1,1]", "[1,0,0,-1,-2,-1]");
  }
}
