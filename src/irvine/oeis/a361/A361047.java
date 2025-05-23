package irvine.oeis.a361;
// Generated by gen_seq4.pl 2025-02-16.ack/polyz at 2025-02-16 22:50

import irvine.oeis.PolynomialFieldSequence;

/**
 * A361047 Expansion of g.f. A(x) satisfying A(x) = Series_Reversion(x - x^3*A'(x)^2).
 * rev(x-x^3*dif(A(x))^2)
 * @author Georg Fischer
 */
public class A361047 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A361047() {
    super(1, "[[0,1]]", ";x;x;^3;A;dif;^2;*;-;rev", 0, 0, 1, 2);
  }
}
