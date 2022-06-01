package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147587 a(n) = 14*n + 7.
 * @author Sean A. Irvine
 */
public class A147587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147587() {
    super(new long[] {-1, 2}, new long[] {7, 21});
  }
}
