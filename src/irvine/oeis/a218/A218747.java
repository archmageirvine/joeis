package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218747 a(n) = (44^n - 1)/43.
 * @author Sean A. Irvine
 */
public class A218747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218747() {
    super(new long[] {-44, 45}, new long[] {0, 1});
  }
}
