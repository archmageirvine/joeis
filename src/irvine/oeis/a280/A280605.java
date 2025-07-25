package irvine.oeis.a280;
// Generated by gen_seq4.pl 2025-06-28.ack/polya at 2025-06-28 22:36

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a246.A246547;

/**
 * A280605 Expansion of 1/(1 - Sum_{p prime, k&gt;=2} x^(p^k)).
 * new CharacteristicFunction(0, new A246547())
 * @author Georg Fischer
 */
public class A280605 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A280605() {
    super(0, "[1]", "1,1,x,B,-,/", 0, 0, 1, 1, new CharacteristicFunction(0, new A246547()));
  }
}
