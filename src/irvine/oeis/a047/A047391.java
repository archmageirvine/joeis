package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047391.
 * @author Sean A. Irvine
 */
public class A047391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047391() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 5, 8});
  }
}
