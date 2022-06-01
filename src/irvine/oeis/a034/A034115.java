package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034115 Fractional part of square root of a(n) starts with 9: first term of runs.
 * @author Sean A. Irvine
 */
public class A034115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034115() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {35, 48, 63, 80, 99, 119, 142});
  }
}
