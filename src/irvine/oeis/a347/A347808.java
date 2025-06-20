package irvine.oeis.a347;
// Generated by gen_seq4.pl 2025-05-27.ack/polya at 2025-05-27 23:49

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000122;

/**
 * A347808 Expansion of (theta_3(x) - 1)^5 / (16 * (3 - theta_3(x))).
 * new A000122()
 * @author Georg Fischer
 */
public class A347808 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A347808() {
    super(5, "[1]", "x,S,1,-,^5,16,3,x,S,-,*,/", 0, 0, 1, 1, new A000122());
  }
}
