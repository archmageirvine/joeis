package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036135 <code>a(n) = 2^n mod 83</code>.
 * @author Sean A. Irvine
 */
public class A036135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036135() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 32, 64, 45, 7, 14, 28, 56, 29, 58, 33, 66, 49, 15, 30, 60, 37, 74, 65, 47, 11, 22, 44, 5, 10, 20, 40, 80, 77, 71, 59, 35, 70, 57, 31, 62, 41, 82});
  }
}
