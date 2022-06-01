package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147958 a(n) = ((7 + sqrt(2))^n + (7 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A147958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147958() {
    super(new long[] {-47, 14}, new long[] {1, 7});
  }
}
