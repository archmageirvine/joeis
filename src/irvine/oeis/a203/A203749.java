package irvine.oeis.a203;
// Generated by gen_seq4.pl quots at 2021-11-26 23:52

import irvine.oeis.SelfQuotientSequence;

/**
 * A203749 v(n+1)/v(n), where v=A203748.
 * @author Georg Fischer
 */
public class A203749 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A203749() {
    super(new A203748(), 1);
  }
}
