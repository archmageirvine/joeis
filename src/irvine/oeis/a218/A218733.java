package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218733 a(n) = (30^n - 1)/29.
 * @author Sean A. Irvine
 */
public class A218733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218733() {
    super(new long[] {-30, 31}, new long[] {0, 1});
  }
}
