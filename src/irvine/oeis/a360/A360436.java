package irvine.oeis.a360;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A360436 32-gonal numbers: a(n) = n*(15*n-14).
 * @author Georg Fischer
 */
public class A360436 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A360436() {
    super(0, "[0,1,29]", "[1,-3,3,-1]");
  }
}
