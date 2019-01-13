package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033143.
 * @author Sean A. Irvine
 */
public class A033143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033143() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 7, 49, 344});
  }
}
