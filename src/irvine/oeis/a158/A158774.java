package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158774 a(n) = 80*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158774() {
    super(new long[] {1, -3, 3}, new long[] {79, 319, 719});
  }
}
