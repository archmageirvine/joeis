package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158601 a(n) = 400*n^2 + 20.
 * @author Sean A. Irvine
 */
public class A158601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158601() {
    super(new long[] {1, -3, 3}, new long[] {20, 420, 1620});
  }
}
