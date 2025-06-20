package irvine.oeis.a304;
// Generated by gen_seq4.pl 2025-05-30.ack/polya at 2025-05-30 21:48

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a002.A002448;

/**
 * A304627 a(n) = [x^n] Product_{k&gt;=1} (1 + x^k)*(1 - x^(n*k))/((1 - x^k)*(1 + x^(n*k))).
 * new A002448()
 * @author Georg Fischer
 */
public class A304627 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A304627() {
    super(0, "[1],[0,2],[1,-1]", "1,x,S,/,p1,p2,/,-", 0, 0, 1, 1, new A002448());
  }
}
