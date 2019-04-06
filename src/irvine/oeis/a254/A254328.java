package irvine.oeis.a254;

import irvine.oeis.FiniteSequence;

/**
 * A254328 Numbers k such that all x^2 mod k are squares (including 0 and 1).
 * @author Georg Fischer
 */
public class A254328 extends FiniteSequence {

  /** Construct the sequence. */
  public A254328() {
    super(1, 2, 3, 4, 5, 8, 12, 16);
  }
}
