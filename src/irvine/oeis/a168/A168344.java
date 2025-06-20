package irvine.oeis.a168;
// Generated by gen_seq4.pl 2025-06-12.ack/polya at 2025-06-12 21:49

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a006.A006664;

/**
 * A168344 G.f. A(x) satisfies: A(x) = G(x*A(x)) where A(x/G(x)) = G(x) = g.f. of A006664, which is the number of irreducible systems of meanders.
 * new A006664()
 * @author Georg Fischer
 */
public class A168344 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A168344() {
    super(0, "[1]", "A,<1,B", 0, 0, 1, 1, new A006664());
  }
}
