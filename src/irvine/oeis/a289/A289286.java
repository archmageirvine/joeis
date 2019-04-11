package irvine.oeis.a289;

import irvine.oeis.FiniteSequence;

/**
 * A289286 Starting with <code>a(1) = 1, a(n) =</code> smallest nonnegative integer not yet in the sequence such that the last digit of <code>a(n-1)</code> plus the first digit of <code>a(n)</code> is equal to 8. The digit 0 is not allowed.
 * @author Georg Fischer
 */
public class A289286 extends FiniteSequence {

  /** Construct the sequence. */
  public A289286() {
    super(1, 7, 11, 71, 72, 6, 2, 61, 73, 5, 3, 51, 74, 4, 41, 75, 31, 76, 21, 77, 12, 62, 63, 52, 64, 42, 65, 32, 66, 22, 67, 13, 53, 54, 43, 55, 33, 56, 23, 57, 14, 44, 45, 34, 46, 24, 47, 15, 35, 36, 25, 37, 16, 26, 27, 17, 18);
  }
}
