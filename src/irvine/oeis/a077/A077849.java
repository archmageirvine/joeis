package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077849.
 * @author Sean A. Irvine
 */
public class A077849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077849() {
    super(new long[] {-1, 0, -1, 3}, new long[] {1, 3, 8, 21});
  }
}
