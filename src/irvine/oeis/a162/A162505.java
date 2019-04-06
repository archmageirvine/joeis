package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162505 G.f. is the polynomial (1-x^3) * (1-x^6) * (1-x^9) * (1-x^12) / (1-x)^4.
 * @author Georg Fischer
 */
public class A162505 extends FiniteSequence {

  /** Construct the sequence. */
  public A162505() {
    super(1, 4, 10, 19, 31, 46, 63, 81, 99, 116, 131, 143, 151, 154, 151, 143, 131, 116, 99, 81, 63, 46, 31, 19, 10, 4, 1);
  }
}
