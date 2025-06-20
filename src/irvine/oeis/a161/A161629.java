package irvine.oeis.a161;
// Generated by gen_seq4.pl 2025-06-08.ack/polyxa at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000108;

/**
 * A161629 E.g.f. satisfies: A(x) = exp( x*Catalan(x*A(x)) ), where Catalan(x) = (1-sqrt(1-4*x))/(2*x) is the g.f. of A000108.
 * new A000108()
 * @author Georg Fischer
 */
public class A161629 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A161629() {
    super(0, "[1]", "A,<1,B,<1,exp", 0, 1, 1, 1, new A000108());
  }
}
