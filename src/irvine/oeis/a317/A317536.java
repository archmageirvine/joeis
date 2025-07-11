package irvine.oeis.a317;
// Generated by gen_seq4.pl 2025-06-28.ack/polya at 2025-06-28 22:36

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a111.A111133;

/**
 * A317536 Expansion of 1/(1 + 1/(1 - x) - Product_{k&gt;=1} (1 + x^k)).
 * new A111133()
 * @author Georg Fischer
 */
public class A317536 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A317536() {
    super(0, "[1]", "1,1,x,B,-,/", 0, 0, 1, 1, new A111133());
  }
}
