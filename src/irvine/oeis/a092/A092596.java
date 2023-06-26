package irvine.oeis.a092;

import irvine.oeis.FiniteSequence;

/**
 * A092596 Natural numbers n for which sum of decimal digits is greater than n/2.
 * @author Georg Fischer
 */
public class A092596 extends FiniteSequence {

  /** Construct the sequence. */
  public A092596() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 19);
  }
}
