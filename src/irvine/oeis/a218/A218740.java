package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218740 a(n) = (37^n - 1)/36.
 * @author Sean A. Irvine
 */
public class A218740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218740() {
    super(new long[] {-37, 38}, new long[] {0, 1});
  }
}
