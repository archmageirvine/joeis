package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206481 a(n) + a(n+2) = n^3.
 * @author Sean A. Irvine
 */
public class A206481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206481() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {0, 1, 1, 7, 26, 57});
  }
}
