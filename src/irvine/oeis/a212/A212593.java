package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212593 a(n) is the difference between multiples of 9 with even and odd digit sum in base 8 in interval [0,8^n).
 * @author Sean A. Irvine
 */
public class A212593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212593() {
    super(1, new long[] {-9, 0, 84, 0, -126, 0, 36, 0}, new long[] {1, 8, 15, 232, 449, 7400, 14351, 237832});
  }
}
