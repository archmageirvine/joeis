package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-01-25.ack/poly at 2025-01-25 22:44

import irvine.oeis.PolynomialFieldSequence;

/**
 * A352044 a(0) = 1; a(n) = Sum_{k=0..floor((n-1)/2)} binomial(n-1,2*k) * a(k).
 * G.f.A(x) satisfies: A(x) = 1 + x * A(x^2/(1 - x)^2) / (1 - x).
 * @author Georg Fischer
 */
public class A352044 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A352044() {
    super(0, "[[1],[1,-1]]", ",p0,x,^2,p1,^2,/,sub,p1,/,<1,+");
  }
}
