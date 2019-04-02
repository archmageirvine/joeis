package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241929 Number of inequivalent colorings of the Fano plane with n colors.
 * @author Sean A. Irvine
 */
public class A241929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241929() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 10, 60, 264, 930, 2766, 7205, 16880});
  }
}
