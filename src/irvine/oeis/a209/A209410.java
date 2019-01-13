package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209410.
 * @author Sean A. Irvine
 */
public class A209410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209410() {
    super(new long[] {-1, -1, 0, 2, 2, 0, 2, 0, 1}, new long[] {1, 2, 4, 8, 16, 28, 49, 91, 169});
  }
}
