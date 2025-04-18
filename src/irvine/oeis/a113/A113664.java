package irvine.oeis.a113;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A113664 Self-convolution 4th power of A113670, where a(n) = A113670(n+1)/(n+1).
 * (1+x*dif(x*A(x)))^4
 * @author Georg Fischer
 */
public class A113664 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A113664() {
    super(0, "[[1]]", ";1;x;x;A;*;dif;*;+;4;^", 0, 0);
  }
}
