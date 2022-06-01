package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147651 First trisection of A028560.
 * @author Sean A. Irvine
 */
public class A147651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147651() {
    super(new long[] {1, -3, 3}, new long[] {0, 27, 72});
  }
}
