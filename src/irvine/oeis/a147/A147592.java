package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147592.
 * @author Sean A. Irvine
 */
public class A147592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147592() {
    super(new long[] {-1, -1, 1, 3, 1, -1}, new long[] {1, -1, 2, 0, 0, 4});
  }
}
