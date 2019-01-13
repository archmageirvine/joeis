package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047407.
 * @author Sean A. Irvine
 */
public class A047407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047407() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 4, 6, 8});
  }
}
