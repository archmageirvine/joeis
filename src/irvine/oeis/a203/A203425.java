package irvine.oeis.a203;
// Generated by gen_seq4.pl quots at 2021-11-26 23:52

import irvine.oeis.SelfQuotientSequence;

/**
 * A203425 a(n) = w(n+1)/(4*w(n)), where w = A203424.
 * @author Georg Fischer
 */
public class A203425 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A203425() {
    super(new A203424(), 4);
  }
}
