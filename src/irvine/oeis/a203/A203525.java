package irvine.oeis.a203;
// Generated by gen_seq4.pl quots at 2021-11-26 23:52

import irvine.oeis.SelfQuotientSequence;

/**
 * A203525 a(n) = v(n+1)/(8*v(n)), where v=A203524.
 * @author Georg Fischer
 */
public class A203525 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A203525() {
    super(new A203524(), 8);
  }
}
