package irvine.oeis.a127;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A127784 G.f. satisfies: A(x) = 1 + (x+x^2)*A(x+x^2)^2.
 * 1+(x+x^2)*A(x+x^2)^2
 * @author Georg Fischer
 */
public class A127784 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A127784() {
    super(0, "[[1]]", ";1;x;x;^2;+;x;x;^2;+;sub;^2;*;+", 0, 0);
  }
}
