package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077919.
 * @author Sean A. Irvine
 */
public class A077919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077919() {
    super(new long[] {2, -4, 4, -1}, new long[] {1, -1, 5, -13});
  }
}
