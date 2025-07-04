package irvine.oeis.a307;
// Generated by gen_seq4.pl 2025-05-30.ack/polyxa at 2025-05-30 21:48

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a002.A002448;

/**
 * A307524 Expansion of e.g.f. Product_{k&gt;=1} (1 + log(1/(1 - x))^k)/(1 - log(1/(1 - x))^k).
 * new A002448()
 * @author Georg Fischer
 */
public class A307524 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A307524() {
    super(0, "[1],[1,-1]", "1,1,p1,/,log,S,/", 0, 1, 1, 1, new A002448());
  }
}
