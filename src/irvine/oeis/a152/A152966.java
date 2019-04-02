package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152966 Twice repdigit numbers.
 * @author Sean A. Irvine
 */
public class A152966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152966() {
    super(new long[] {-10, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 22, 44, 66, 88, 110, 132, 154, 176});
  }
}
