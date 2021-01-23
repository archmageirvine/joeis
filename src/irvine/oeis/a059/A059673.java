package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059673 Sum of binary numbers with n 1's and one (non-leading) 0.
 * @author Sean A. Irvine
 */
public class A059673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059673() {
    super(new long[] {-4, 12, -13, 6}, new long[] {0, 2, 11, 38});
  }
}
