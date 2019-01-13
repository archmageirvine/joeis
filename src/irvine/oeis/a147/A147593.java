package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147593.
 * @author Sean A. Irvine
 */
public class A147593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147593() {
    super(new long[] {-1, 1, 0, -1, 3, -1, 0, 1}, new long[] {1, 1, 1, 0, 2, 3, 5, 3});
  }
}
