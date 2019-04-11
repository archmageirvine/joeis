package irvine.oeis.a274;

import irvine.oeis.FiniteSequence;

/**
 * A274337 Numbers n such that <code>2^n</code> is not the sum of 5 positive cubes.
 * @author Georg Fischer
 */
public class A274337 extends FiniteSequence {

  /** Construct the sequence. */
  public A274337() {
    super(0, 1, 2, 3, 4, 5, 7, 8, 10, 11, 14);
  }
}
