package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147663.
 * @author Sean A. Irvine
 */
public class A147663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147663() {
    super(new long[] {1, 0, -1, 0, 1, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 5, 7, 9, 12});
  }
}
