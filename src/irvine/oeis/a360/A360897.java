package irvine.oeis.a360;
// Generated by gen_seq4.pl 2025-01-25.ack/poly at 2025-01-25 22:44

import irvine.oeis.PolynomialFieldSequence;

/**
 * A360897 G.f. satisfies A(x) = 1 + x * A(x * (1 - x^3)).
 * G.f.satisfies A(x) = 1 + x * A(x * (1 - x^3)).
 * @author Georg Fischer
 */
public class A360897 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A360897() {
    super(0, "[[1],[0,1,0,0,-1]]", ",p0,p1,sub,<1,+");
  }
}
