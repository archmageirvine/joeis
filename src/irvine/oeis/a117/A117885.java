package irvine.oeis.a117;

import irvine.oeis.FiniteSequence;

/**
 * A117885 Numbers n such that a regular (n^3-n)-gon can be constructed by means of a ruler and compass.
 * @author Georg Fischer
 */
public class A117885 extends FiniteSequence {

  /** Construct the sequence. */
  public A117885() {
    super(2, 3, 4, 5, 16, 256, 65536);
  }
}
