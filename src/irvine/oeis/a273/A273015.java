package irvine.oeis.a273;

import irvine.oeis.FiniteSequence;

/**
 * A273015 Ramanujan's largely composite numbers having 3 as the greatest prime divisor.
 * @author Georg Fischer
 */
public class A273015 extends FiniteSequence {

  /** Construct the sequence. */
  public A273015() {
    super(1, FINITE, 3, 6, 12, 18, 24, 36, 48, 72, 96, 108);
  }
}
