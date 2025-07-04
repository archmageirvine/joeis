package irvine.oeis.a338;
// Generated by gen_seq4.pl 2025-05-30.ack/polya at 2025-05-30 21:48

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a002.A002448;

/**
 * A338223 G.f.: (1 / theta_4(x) - 1)^2 / 4, where theta_4() is the Jacobi theta function.
 * new A002448()
 * @author Georg Fischer
 */
public class A338223 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A338223() {
    super(2, "[1],[0,16]", "1,x,S,/,1,-,^2,4,/", 0, 0, 1, 1, new A002448());
  }
}
