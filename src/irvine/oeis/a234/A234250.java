package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234250.
 * @author Sean A. Irvine
 */
public class A234250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234250() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 16, 111, 439, 1305, 3240, 7091});
  }
}
