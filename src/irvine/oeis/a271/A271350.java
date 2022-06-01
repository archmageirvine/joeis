package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271350 a(n) = 3^n mod 83.
 * @author Sean A. Irvine
 */
public class A271350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271350() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 9, 27, 81, 77, 65, 29, 4, 12, 36, 25, 75, 59, 11, 33, 16, 48, 61, 17, 51, 70, 44, 49, 64, 26, 78, 68, 38, 31, 10, 30, 7, 21, 63, 23, 69, 41, 40, 37, 28});
  }
}
