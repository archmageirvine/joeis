package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218727 a(n) = (24^n - 1)/23.
 * @author Sean A. Irvine
 */
public class A218727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218727() {
    super(new long[] {-24, 25}, new long[] {0, 1});
  }
}
