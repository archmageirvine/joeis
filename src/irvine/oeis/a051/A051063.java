package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051063 27*n+9 or 27*n+18.
 * @author Sean A. Irvine
 */
public class A051063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051063() {
    super(new long[] {-1, 1, 1}, new long[] {9, 18, 36});
  }
}
