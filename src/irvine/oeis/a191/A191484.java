package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191484.
 * @author Sean A. Irvine
 */
public class A191484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191484() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {1, 16, 122, 512, 1563, 3888, 8404});
  }
}
