package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047583.
 * @author Sean A. Irvine
 */
public class A047583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047583() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 3, 5, 6, 7, 8});
  }
}
