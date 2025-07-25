package irvine.oeis.a304;
// Generated by gen_seq4.pl 2025-06-15.ack/polyxa at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a107.A107675;

/**
 * A304323 O.g.f. A(x) satisfies: [x^n] exp( n^3 * x ) / A(x) = 0 for n&gt;0.
 * new A107675()
 * @author Georg Fischer
 */
public class A304323 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A304323() {
    super(0, "[1]", "1,1,x,B,<1,-,/", 1, 0, 1, 1, new A107675());
  }
}
