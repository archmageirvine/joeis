package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147623.
 * @author Sean A. Irvine
 */
public class A147623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147623() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 2, 6, 12, 22});
  }
}
