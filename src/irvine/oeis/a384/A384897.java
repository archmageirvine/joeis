package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-22.ack/poly at 2025-06-22 22:11

import irvine.oeis.PolynomialFieldSequence;

/**
 * A384897 G.f. A(x) satisfies A(x) = 1 + x/A(-x*A(x)^2)^3.
 * A(x) satisfies A(x) = 1 + x/A(-x*A(x)^2)^3.
 * @author Georg Fischer
 */
public class A384897 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A384897() {
    super(0, "[1],[0,-1]", "1,x,p1,A,^2,*,sub,^3,/,+");
  }
}
