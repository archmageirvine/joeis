package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201967.
 * @author Sean A. Irvine
 */
public class A201967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201967() {
    super(new long[] {-1, 0, 3, 2}, new long[] {1, 2, 7, 20});
  }
}
