package irvine.oeis.a289;

import irvine.oeis.FiniteSequence;

/**
 * A289284 Starting with a(1) = 1, a(n) = smallest nonnegative integer not yet in the sequence such that the last digit of a(n-1) plus the first digit of a(n) is equal to 6. The digit 0 is not allowed.
 * @author Georg Fischer
 */
public class A289284 extends FiniteSequence {

  /** Construct the sequence. */
  public A289284() {
    super(1, 5, 11, 51, 52, 4, 2, 41, 53, 3, 31, 54, 21, 55, 12, 42, 43, 32, 44, 22, 45, 13, 33, 34, 23, 35, 14, 24, 25, 15, 16);
  }
}
