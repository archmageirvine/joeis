package irvine.oeis.a092;

import irvine.oeis.FiniteSequence;

/**
 * A092597 Natural numbers n for which sum of decimal digits is not smaller than n/3.
 * @author Georg Fischer
 */
public class A092597 extends FiniteSequence {

  /** Construct the sequence. */
  public A092597() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 15, 16, 17, 18, 19, 28, 29);
  }
}
