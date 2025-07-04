package irvine.oeis.a308;
// Generated by gen_seq4.pl 2025-06-08.ack/polyx at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;

/**
 * A308392 Expansion of e.g.f. exp(x + 2 * Sum_{k&gt;=1} x^(2^k)/2^k).
 * E.g.f.: exp(-x)*g(x)^2,
 * @author Georg Fischer
 */
public class A308392 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A308392() {
    super(0, "[1],[0,-1]A005388!", "p1,exp,x,B,^2,*", 0, 1);
  }
}
