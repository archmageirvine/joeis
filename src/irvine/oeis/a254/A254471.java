package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254471 Sixth partial sums of fifth powers (A000584).
 * @author Sean A. Irvine
 */
public class A254471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254471() {
    super(1, new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 38, 456, 3210, 16290, 65922, 225576, 677742, 1834755, 4559620, 10547888, 22958364});
  }
}
