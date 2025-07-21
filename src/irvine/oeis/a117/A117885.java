package irvine.oeis.a117;

import irvine.oeis.FiniteSequence;

/**
 * A117885 Numbers k such that a regular (k^3-k)-gon can be constructed by means of a ruler and compass.
 * @author Georg Fischer
 */
public class A117885 extends FiniteSequence {

  /** Construct the sequence. */
  public A117885() {
    super(1, FINITE, 2, 3, 4, 5, 16, 256, 65536);
  }
}
