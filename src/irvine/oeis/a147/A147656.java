package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147656 The arithmetic mean of the n-th and (n+1)-st cubes, rounded down.
 * @author Sean A. Irvine
 */
public class A147656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147656() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 17, 45});
  }
}
