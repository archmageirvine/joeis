package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133377 Complete list of decimal numbers that when converted to hexadecimal produce the mirror image of the original number. There are 14 numbers in all, including single-digit numbers.
 * @author Georg Fischer
 */
public class A133377 extends FiniteSequence {

  /** Construct the sequence. */
  public A133377() {
    super(1, FINITE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 53, 371, 5141, 99481);
  }
}
