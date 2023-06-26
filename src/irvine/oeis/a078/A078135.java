package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078135 Numbers which cannot be written as a sum of squares &gt; 1.
 * @author Georg Fischer
 */
public class A078135 extends FiniteSequence {

  /** Construct the sequence. */
  public A078135() {
    super(1, FINITE, 1, 2, 3, 5, 6, 7, 10, 11, 14, 15, 19, 23);
  }
}
