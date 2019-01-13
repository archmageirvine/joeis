package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147567.
 * @author Sean A. Irvine
 */
public class A147567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147567() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0}, new long[] {2, 1, 3, 4, 1, 2, -1, 3});
  }
}
