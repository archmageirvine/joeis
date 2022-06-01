package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158771 a(n) = 78*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158771() {
    super(new long[] {1, -3, 3}, new long[] {77, 311, 701});
  }
}
