package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-06-10.ack/polyez

import irvine.oeis.PolynomialFieldSequence;

/**
 * A352277 a(0) = 1; a(n) = -2 * Sum_{k=1..n} binomial(2*n-1,2*k-1) * a(n-k).
 * E.g.f.: <code>exp(2*(1-cosh(x)))</code>.
 * @author Georg Fischer
 */
public class A352277 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A352277() {
    super(0, "[1]", "2,1,x,cosh,-,*,exp", 0, 1, 0, 2);
  }
}
