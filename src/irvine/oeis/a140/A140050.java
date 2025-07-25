package irvine.oeis.a140;
// Generated by gen_seq4.pl 2025-07-13.ack/polya at 2025-07-13 21:23

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a014.A014070;

/**
 * A140050 L.g.f.: A(x) = log(G(x)) where G(x) = g.f. of A014070(n) = C(2^n,n).
 * new A014070()
 * @author Georg Fischer
 */
public class A140050 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A140050() {
    super(1, "[1]", "x,B,log,n,*", 0, 0, 1, 1, new A014070());
  }
}
