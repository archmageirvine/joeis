package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218743 a(n) = (40^n-1)/39.
 * @author Sean A. Irvine
 */
public class A218743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218743() {
    super(new long[] {-40, 41}, new long[] {0, 1});
  }
}
