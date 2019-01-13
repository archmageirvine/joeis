package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048509.
 * @author Sean A. Irvine
 */
public class A048509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048509() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 26, 87, 233});
  }
}
