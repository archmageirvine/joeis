package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225058.
 * @author Sean A. Irvine
 */
public class A225058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225058() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {-1, 1, 1, 3, 0, 5, 3, 7});
  }
}
