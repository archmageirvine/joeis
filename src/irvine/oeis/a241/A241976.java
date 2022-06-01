package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241976 Values of k such that k^2 + (k+3)^2 is a square.
 * @author Sean A. Irvine
 */
public class A241976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241976() {
    super(new long[] {1, -7, 7}, new long[] {0, 9, 60});
  }
}
