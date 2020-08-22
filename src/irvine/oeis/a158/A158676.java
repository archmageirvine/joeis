package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158676 a(n) = 62*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158676() {
    super(new long[] {1, -3, 3}, new long[] {1, 63, 249});
  }
}
