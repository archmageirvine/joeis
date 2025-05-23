package irvine.oeis.a219;
// Generated by gen_seq4.pl 2025-05-08.ack/polyxa at 2025-05-08 13:52

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000178;

/**
 * A219269 G.f. satisfies: A(x) = Sum_{n&gt;=0} x^n/A(x)^n * Product_{k=0..n} k!.
 * new A000178()
 * @author Georg Fischer
 */
public class A219269 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A219269() {
    super(0, "[1]", "x,x,S,<1,rev,/", 1, 0, 1, 1, new A000178());
  }
}
