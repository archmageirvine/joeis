package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036131 <code>a(n) = 2^n mod 67</code>.
 * @author Sean A. Irvine
 */
public class A036131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036131() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 32, 64, 61, 55, 43, 19, 38, 9, 18, 36, 5, 10, 20, 40, 13, 26, 52, 37, 7, 14, 28, 56, 45, 23, 46, 25, 50, 33, 66});
  }
}
