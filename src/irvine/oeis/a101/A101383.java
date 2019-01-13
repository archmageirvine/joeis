package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101383.
 * @author Sean A. Irvine
 */
public class A101383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101383() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 14, 94, 380, 1135});
  }
}
