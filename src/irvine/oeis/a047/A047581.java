package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047581.
 * @author Sean A. Irvine
 */
public class A047581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047581() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 5, 6, 7, 8});
  }
}
