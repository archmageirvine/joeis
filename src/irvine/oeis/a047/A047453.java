package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047453.
 * @author Sean A. Irvine
 */
public class A047453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047453() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 8});
  }
}
