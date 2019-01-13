package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267925.
 * @author Sean A. Irvine
 */
public class A267925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267925() {
    super(new long[] {-10000, 10000, 1}, new long[] {1, 111, 10111});
  }
}
