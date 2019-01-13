package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267854.
 * @author Sean A. Irvine
 */
public class A267854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267854() {
    super(new long[] {-100000000, 0, 10000, 0, 10000, 0}, new long[] {1, 110, 10100, 1111000, 101110000, 11101100000L});
  }
}
