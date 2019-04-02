package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147957 a(n) = ((6 + sqrt(2))^n + (6 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A147957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147957() {
    super(new long[] {-34, 12}, new long[] {1, 6});
  }
}
