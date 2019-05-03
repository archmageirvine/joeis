package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178341 Smallest multiple of 3 such that decimals digits 1, ..., k <code>(k = 1</code>, ..., <code>9)</code> and 0 appear in any order.
 * @author Georg Fischer
 */
public class A178341 extends FiniteSequence {

  /** Construct the sequence. */
  public A178341() {
    super(12, 12, 123, 12234, 12345, 123456, 12234567, 12345678, 123456789L, 1023456789L);
  }
}
