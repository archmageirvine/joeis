package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105371.
 * @author Sean A. Irvine
 */
public class A105371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105371() {
    super(new long[] {-1, 2, -4, 3}, new long[] {1, 1, 1, 0});
  }
}
