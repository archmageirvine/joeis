package irvine.oeis.a168;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A168602 G.f. satisfies: A(x) = 1 + x*A(x)^2*A(2x).
 * 1+x*A(x)^2*A(2x)
 * @author Georg Fischer
 */
public class A168602 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A168602() {
    super(0, "[[1]]", ";1;x;A;^2;*;2;x;*;sub;*;+", 0, 0);
  }
}
