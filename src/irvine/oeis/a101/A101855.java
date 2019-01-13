package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101855.
 * @author Sean A. Irvine
 */
public class A101855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101855() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {6, 30, 91, 216, 441, 812});
  }
}
