package irvine.oeis.a207;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A207262 a(n) = 2^(4n - 2) + 1.
 * @author Sean A. Irvine
 */
public class A207262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207262() {
    super(new long[] {-16, 17}, new long[] {5, 65});
  }
}
