package irvine.oeis.a088;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A088713 G.f. A(x) satisfies A(x/A(x)) = 1/(1-x).
 * 1+x*A(x)*A(1-1/A(x))
 * @author Georg Fischer
 */
public class A088713 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A088713() {
    super(0, "[[1]]", ";1;x;A;*;1;1;A;/;-;sub;*;+", 0, 0);
  }
}
