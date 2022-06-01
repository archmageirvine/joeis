package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020530 a(n) = 8^n + 2^(n+1).
 * @author Sean A. Irvine
 */
public class A020530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020530() {
    super(new long[] {-16, 10}, new long[] {3, 12});
  }
}
