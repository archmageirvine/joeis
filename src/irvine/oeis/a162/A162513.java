package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162513 G.f. is the polynomial (1-x^3) * (1-x^6) * (1-x^9) * (1-x^12) * (1-x^15) / (1-x)^5.
 * @author Georg Fischer
 */
public class A162513 extends FiniteSequence {

  /** Construct the sequence. */
  public A162513() {
    super(1, 5, 15, 34, 65, 111, 174, 255, 354, 470, 601, 744, 895, 1049, 1200, 1342, 1469, 1575, 1655, 1705, 1722, 1705, 1655, 1575, 1469, 1342, 1200, 1049, 895, 744, 601, 470, 354, 255, 174, 111, 65, 34, 15, 5, 1);
  }
}
