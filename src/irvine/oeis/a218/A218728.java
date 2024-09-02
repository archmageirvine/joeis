package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218728 a(n) = (25^n - 1)/24.
 * @author Sean A. Irvine
 */
public class A218728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218728() {
    super(new long[] {-25, 26}, new long[] {0, 1});
  }
}
