package irvine.oeis.a341;
// Generated by gen_seq4.pl 2025-05-27.ack/polya at 2025-05-27 23:49

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a002.A002448;

/**
 * A341364 Expansion of (1 / theta_4(x) - 1)^3 / 8.
 * new A002448()
 * @author Georg Fischer
 */
public class A341364 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A341364() {
    super(3, "[0,0,0,1],A002448", "1,x,S,/,1,-,^3,8,/", 0, 0, 1, 1, new A002448());
  }
}
