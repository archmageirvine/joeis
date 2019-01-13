package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049672.
 * @author Sean A. Irvine
 */
public class A049672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049672() {
    super(new long[] {1, -6, -7, 8}, new long[] {0, 1, 10, 71});
  }
}
