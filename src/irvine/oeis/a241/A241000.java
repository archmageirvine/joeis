package irvine.oeis.a241;
// Generated by gen_seq4.pl 2025-01-27.ack/poly at 2025-01-27 21:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A241000 G.f. satisfies: A(x) = A(x/A(x))^2 - x.
 * G.f.satisfies: A(x) = A(x/A(x))^2 - x.
 * @author Georg Fischer
 */
public class A241000 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A241000() {
    super(0, "[[1],[1,1]]", ",A,^2,<1,p1,/,sub,p1,*,A,/");
  }
}
