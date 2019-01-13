package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108479.
 * @author Sean A. Irvine
 */
public class A108479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108479() {
    super(new long[] {-1, 2, 1, 2}, new long[] {1, 1, 2, 7});
  }
}
