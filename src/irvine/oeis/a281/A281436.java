package irvine.oeis.a281;
// Generated by gen_seq4.pl 2025-03-09.ack/polyz at 2025-03-09 21:42

import irvine.oeis.PolynomialFieldSequence;

/**
 * A281436 E.g.f. C(x) satisfies: C(x) = cosh( Integral C(x)^6 dx ).
 * @author Georg Fischer
 */
public class A281436 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A281436() {
    super(0, "[[1]]", ",A,^6,int,cosh", 0, 1, 0, 2);
  }
}
