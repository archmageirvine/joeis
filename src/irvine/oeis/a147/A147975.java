package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147975 a(n) = 4^n-3^n-2^n-1.
 * @author Sean A. Irvine
 */
public class A147975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147975() {
    super(1, new long[] {-24, 50, -35, 10}, new long[] {-2, -2, 2, 28});
  }
}
