package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-03-28.ack/poly at 2025-03-28 22:47

import irvine.oeis.PolynomialFieldSequence;

/**
 * A382368 Expansion of 1/( 1 - 4 * Sum_{k&gt;=0} x^(3^k) / (1 - x^(3^k)) )^(1/2).
 * @author Georg Fischer
 */
public class A382368 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A382368() {
    super(0, "[[1],[0,0,0,1],[0,4],[1,-1]]", ",1,1,p1,sub,^2,/,p2,p3,/,-,^1/2,/");
  }
}
