package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085537 a(n) = n^4 - n^3.
 * @author Sean A. Irvine
 */
public class A085537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085537() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 8, 54, 192});
  }
}
