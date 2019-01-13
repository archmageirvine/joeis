package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101890.
 * @author Sean A. Irvine
 */
public class A101890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101890() {
    super(new long[] {1, 2, -5, 4}, new long[] {0, 0, 1, 3});
  }
}
