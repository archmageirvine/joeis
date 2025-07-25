package irvine.oeis.a370;
// Generated by gen_seq4.pl 2025-07-13.ack/polya at 2025-07-13 21:23

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a333.A333042;

/**
 * A370294 G.f.: exp(Sum_{k&gt;=1} (4*k)!/(4!*k!^4) * x^k/k).
 * new A333042()
 * @author Georg Fischer
 */
public class A370294 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A370294() {
    super(0, "[1]", "x,B,^1/24", 0, 0, 1, 1, new A333042());
  }
}
