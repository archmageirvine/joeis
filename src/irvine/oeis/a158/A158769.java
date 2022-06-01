package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158769 a(n) = 78*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158769() {
    super(new long[] {1, -3, 3}, new long[] {1, 79, 313});
  }
}
