package irvine.oeis.a229;

import irvine.oeis.FiniteSequence;

/**
 * A229792 Numbers n with the property that there exists an m such that n is the sum of m distinct nonzero digits <code>(with 1&lt;m&lt;10)</code> in a unique way.
 * @author Georg Fischer
 */
public class A229792 extends FiniteSequence {

  /** Construct the sequence. */
  public A229792() {
    super(3, 4, 6, 7, 10, 11, 15, 16, 17, 21, 22, 23, 24, 28, 29, 30, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45);
  }
}
