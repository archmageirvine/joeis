package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158766 a(n) = 1444*n^2 + 38.
 * @author Sean A. Irvine
 */
public class A158766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158766() {
    super(new long[] {1, -3, 3}, new long[] {38, 1482, 5814});
  }
}
