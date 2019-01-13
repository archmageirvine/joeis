package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047399.
 * @author Sean A. Irvine
 */
public class A047399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047399() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 6, 8});
  }
}
