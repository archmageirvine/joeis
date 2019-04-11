package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122046 Partial sums of <code>floor(n^2/8)</code>.
 * @author Sean A. Irvine
 */
public class A122046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122046() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {0, 0, 0, 1, 3, 6, 10});
  }
}
