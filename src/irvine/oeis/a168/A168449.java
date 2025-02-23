package irvine.oeis.a168;
// Generated by gen_seq4.pl 2025-02-14.ack/polyx at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A168449 G.f. satisfies: A(x/A(x)) = C(x)^2 where C(x) = 1 + x*C(x)^2 is the g.f. of the Catalan numbers (A000108).
 * (1+A*serreverse(x/(A)))^2)
 * @author Georg Fischer
 */
public class A168449 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A168449() {
    super(0, "[1,1]", ";1;A;x;A;/;rev;*;+;^2", 0, 0);
  }
}
