package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101442.
 * @author Sean A. Irvine
 */
public class A101442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101442() {
    super(new long[] {-1, 2}, new long[] {10007, 19980});
  }
}
