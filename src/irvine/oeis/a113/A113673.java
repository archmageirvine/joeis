package irvine.oeis.a113;
// Generated by gen_seq4.pl 2025-02-12.ack/poly at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A113673 Self-convolution 7th power equals A113667, where a(n) = n*A113667(n-1) for n&gt;=1, with a(0)=1.
 * A(x) = 1 + x*d/dx[x*A(x)^7],
 * @author Georg Fischer
 */
public class A113673 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A113673() {
    super(0, "[[1]]", ", 1,A,^7,<1,dif,<1,+");
  }
}
