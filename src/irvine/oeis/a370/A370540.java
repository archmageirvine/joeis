package irvine.oeis.a370;
// Generated by gen_seq4.pl 2025-05-08.ack/polya at 2025-05-08 13:52

import irvine.oeis.PolynomialFieldSequence;

/**
 * A370540 Expansion of g.f. A(x) satisfying A(x)^2 = A(x^2) * (1 - x*C(x)) * (1 - x*C(x^2)) / (1 - 4*x) where C(x) = 1 + x*C(x)^2 is the Catalan function (A000108).
 * new A370539()
 * @author Georg Fischer
 */
public class A370540 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A370540() {
    super(0, "[1],[0,0,1]", "p1,sub,x,S,*,sqrt", 0, 0, 1, 1, new A370539());
  }
}
