package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236207 Numbers not divisible by 5 or 11.
 * @author Sean A. Irvine
 */
public class A236207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236207() {
    super(new long[] {-1, 2, -1, 0, 0, -1, 2, -1, 0, 0, -1, 2, -1, 0, 0, -1, 2, -1, 0, 0, -1, 2, -1, 0, 0, -1, 2, -1, 0, 0, -1, 2, -1, 0, 0, -1, 2}, new long[] {1, 2, 3, 4, 6, 7, 8, 9, 12, 13, 14, 16, 17, 18, 19, 21, 23, 24, 26, 27, 28, 29, 31, 32, 34, 36, 37, 38, 39, 41, 42, 43, 46, 47, 48, 49, 51});
  }
}
