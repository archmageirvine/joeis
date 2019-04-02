package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094914 Absolute value of n^2 + n - 1354363.
 * @author Sean A. Irvine
 */
public class A094914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094914() {
    super(new long[] {1, -3, 3}, new long[] {1354361, 1354357, 1354351});
  }
}
