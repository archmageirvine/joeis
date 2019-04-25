package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102705 Numbers not of the form <code>7x + 9y</code> with nonnegative x and y.
 * @author Georg Fischer
 */
public class A102705 extends FiniteSequence {

  /** Construct the sequence. */
  public A102705() {
    super(0, 1, 2, 3, 4, 5, 6, 8, 10, 11, 12, 13, 15, 17, 19, 20, 22, 24, 26, 29, 31, 33, 38, 40, 47);
  }
}
