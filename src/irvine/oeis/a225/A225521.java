package irvine.oeis.a225;

import irvine.oeis.FiniteSequence;

/**
 * A225521 Cumulative number of letters in first n English names of playing card denominations: ace, two, three, ... jack, queen, king.
 * @author Georg Fischer
 */
public class A225521 extends FiniteSequence {

  /** Construct the sequence. */
  public A225521() {
    super(1, FINITE, 3, 6, 11, 15, 19, 22, 27, 32, 36, 39, 43, 48, 52);
  }
}
