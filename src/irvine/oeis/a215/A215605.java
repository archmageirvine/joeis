package irvine.oeis.a215;

import irvine.oeis.FiniteSequence;

/**
 * A215605 Number of unordered interval sequences that sum up to 12n in Schoenberg 12-tone rows.
 * @author Georg Fischer
 */
public class A215605 extends FiniteSequence {

  /** Construct the sequence. */
  public A215605() {
    super(1, FINITE, 1, 36, 798, 4507, 11470, 15407, 11470, 4507, 798, 36, 1);
  }
}
