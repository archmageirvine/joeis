package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075665 Sum of next n 4th powers. i^s, s = 4.
 * @author Sean A. Irvine
 */
public class A075665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075665() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 97, 2177, 23058, 152979, 738835, 2839571, 9191876, 26037717, 66301333});
  }
}
