package irvine.oeis.a203;
// Generated by gen_seq4.pl quots at 2021-11-26 23:52

import irvine.oeis.SelfQuotientSequence;

/**
 * A203702 v(n+1)/v(n), where v=A203701.
 * @author Georg Fischer
 */
public class A203702 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A203702() {
    super(new A203701(), 1);
  }
}
