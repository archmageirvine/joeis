package irvine.oeis.a363;
// Generated by gen_seq4.pl ogf/lingf at 2023-06-30 07:57

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A363251 Number of nonisomorphic open quipus with n nodes.
 * @author Georg Fischer
 */
public class A363251 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A363251() {
    super(0, "[1,-1,-4,1,5,4,0,-4,-6,-3,5,4,-1]", "[1,-2,-3,5,3,1,-3,-7,0,1,6,2,-4]");
  }
}
