package irvine.oeis.a113;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A113665 Self-convolution 5th power of A113671, where a(n) = A113671(n+1)/(n+1).
 * (1+x*dif(x*A(x)))^5
 * @author Georg Fischer
 */
public class A113665 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A113665() {
    super(0, "[[1]]", ";1;x;x;A;*;dif;*;+;5;^", 0, 0);
  }
}
