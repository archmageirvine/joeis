package irvine.oeis.a289;

import irvine.oeis.FiniteSequence;

/**
 * A289287 Starting with <code>a(1) = 1, a(n) =</code> smallest nonnegative integer not yet in the sequence such that the last digit of <code>a(n-1)</code> plus the first digit of <code>a(n)</code> is equal to <code>9.</code> The digit 0 is not allowed.
 * @author Georg Fischer
 */
public class A289287 extends FiniteSequence {

  /** Construct the sequence. */
  public A289287() {
    super(1, 8, 11, 81, 82, 7, 2, 71, 83, 6, 3, 61, 84, 5, 4, 51, 85, 41, 86, 31, 87, 21, 88, 12, 72, 73, 62, 74, 52, 75, 42, 76, 32, 77, 22, 78, 13, 63, 64, 53, 65, 43, 66, 33, 67, 23, 68, 14, 54, 55, 44, 56, 34, 57, 24, 58, 15, 45, 46, 35, 47, 25, 48, 16, 36, 37, 26, 38, 17, 27, 28, 18, 19);
  }
}
