package irvine.oeis.a333;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A333044 Exponential self-convolution of A232690.
 * exp(2/sqrt(A(x))*int(A(x)^(3/2)))
 * @author Georg Fischer
 */
public class A333044 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A333044() {
    super(0, "[[1]]", ";2;A;sqrt;/;A;^3/2;int;*;exp", 0, 1);
  }
}
