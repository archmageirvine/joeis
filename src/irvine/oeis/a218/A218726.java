package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218726 a(n) = (23^n - 1)/22.
 * @author Sean A. Irvine
 */
public class A218726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218726() {
    super(new long[] {-23, 24}, new long[] {0, 1});
  }
}
