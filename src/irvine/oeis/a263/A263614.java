package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263614.
 * @author Sean A. Irvine
 */
public class A263614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263614() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {0, 0, 1, 2, 2, 4, 4, 8});
  }
}
