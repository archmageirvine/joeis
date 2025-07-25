package irvine.oeis.a212;
// Generated by gen_seq4.pl 2025-06-01.ack/polya at 2025-06-01 21:15

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000122;

/**
 * A212326 G.f. satisfies: A(x) = theta_3( x*A(x) )^2, where theta_3(x) is Jacobi's theta_3 function.
 * new A000122()
 * @author Georg Fischer
 */
public class A212326 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A212326() {
    super(0, "[1]", "A,<1,S,^2", 0, 0, 1, 1, new A000122());
  }
}
