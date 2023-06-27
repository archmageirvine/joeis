package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133092 Row sums of triangle A133091.
 * @author Sean A. Irvine
 */
public class A133092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133092() {
    super(1, new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 4, 6, 16, 15, 36});
  }
}
