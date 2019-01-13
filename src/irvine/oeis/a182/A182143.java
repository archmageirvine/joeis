package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182143.
 * @author Sean A. Irvine
 */
public class A182143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182143() {
    super(new long[] {1, 3, 1}, new long[] {1, 3, 5});
  }
}
