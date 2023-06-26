package irvine.oeis.a289;

import irvine.oeis.FiniteSequence;

/**
 * A289285 Starting with a(1) = 1, a(n) = smallest nonnegative integer not yet in the sequence such that the last digit of a(n-1) plus the first digit of a(n) is equal to 7. The digit 0 is not allowed.
 * @author Georg Fischer
 */
public class A289285 extends FiniteSequence {

  /** Construct the sequence. */
  public A289285() {
    super(1, FINITE, 1, 6, 11, 61, 62, 5, 2, 51, 63, 4, 3, 41, 64, 31, 65, 21, 66, 12, 52, 53, 42, 54, 32, 55, 22, 56, 13, 43, 44, 33, 45, 23, 46, 14, 34, 35, 24, 36, 15, 25, 26, 16, 17);
  }
}
