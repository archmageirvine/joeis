package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147974 n^3-((n-1)^3+(n-2)^3+(n-3)^3).
 * @author Sean A. Irvine
 */
public class A147974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147974() {
    super(new long[] {-1, 4, -6, 4}, new long[] {10, 8, 18, 28});
  }
}
