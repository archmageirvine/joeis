package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147962 a(n) = ((7+sqrt(3))^n + (7-sqrt(3))^n) / 2.
 * @author Sean A. Irvine
 */
public class A147962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147962() {
    super(new long[] {-46, 14}, new long[] {1, 7});
  }
}
