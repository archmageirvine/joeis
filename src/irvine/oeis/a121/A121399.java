package irvine.oeis.a121;
// Generated by gen_seq4.pl 2025-06-08.ack/polya at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a001.A001006;

/**
 * A121399 G.f. satisfies: A(x) = G(x)*A(x^2*G(x)) where G(x) is the g.f. of the Motzkin numbers (A001006): G = (1 + x*G + x^2*G^2).
 * new A001006()
 * @author Georg Fischer
 */
public class A121399 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A121399() {
    super(0, "[1]", "x,B,x,B,<2,sub,*", 0, 0, 1, 1, new A001006());
  }
}
