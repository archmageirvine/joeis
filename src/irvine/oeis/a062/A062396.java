package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062396 a(n) = 9^n + 1.
 * @author Sean A. Irvine
 */
public class A062396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062396() {
    super(new long[] {-9, 10}, new long[] {2, 10});
  }
}
