package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102841 a(n) = ((9*n^2 + 33*n + 26)*2^n + (-1)^n)/27.
 * @author Sean A. Irvine
 */
public class A102841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102841() {
    super(new long[] {8, -4, -6, 5}, new long[] {1, 5, 19, 61});
  }
}
