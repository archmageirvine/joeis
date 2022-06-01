package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158643 a(n) = 676*n^2 + 26.
 * @author Sean A. Irvine
 */
public class A158643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158643() {
    super(new long[] {1, -3, 3}, new long[] {26, 702, 2730});
  }
}
