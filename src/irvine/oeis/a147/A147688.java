package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147688 a(n) = ((6 + sqrt(8))^n + (6 - sqrt(8))^n)/2.
 * @author Sean A. Irvine
 */
public class A147688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147688() {
    super(new long[] {-28, 12}, new long[] {1, 6});
  }
}
