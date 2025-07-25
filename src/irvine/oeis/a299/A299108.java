package irvine.oeis.a299;
// Generated by gen_seq4.pl 2025-05-30.ack/polya at 2025-05-30 21:48

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a002.A002448;

/**
 * A299108 Expansion of 1/(1 - x*Product_{k&gt;=1} (1 + x^k)/(1 - x^k)).
 * new A002448()
 * @author Georg Fischer
 */
public class A299108 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A299108() {
    super(0, "[1]", "1,1,x,x,S,/,-,/", 0, 0, 1, 1, new A002448());
  }
}
