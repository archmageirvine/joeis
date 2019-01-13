package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101881.
 * @author Sean A. Irvine
 */
public class A101881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101881() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 4, 5, 8});
  }
}
