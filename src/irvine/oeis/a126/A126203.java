package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126203 Middle number of a set of 5 consecutive integers whose sum of cubes is a square.
 * @author Georg Fischer
 */
public class A126203 extends FiniteSequence {

  /** Construct the sequence. */
  public A126203() {
    super(1, FINITE, 0, 2, 3, 27, 98, 120);
  }
}
