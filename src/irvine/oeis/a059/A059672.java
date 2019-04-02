package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059672 Sum of binary numbers with n 1's and one (possibly leading) 0.
 * @author Sean A. Irvine
 */
public class A059672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059672() {
    super(new long[] {-4, 12, -13, 6}, new long[] {0, 3, 14, 45});
  }
}
