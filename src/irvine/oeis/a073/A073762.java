package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073762 a(n) = 24*n - 12.
 * @author Sean A. Irvine
 */
public class A073762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073762() {
    super(1, new long[] {-1, 2}, new long[] {12, 36});
  }
}
