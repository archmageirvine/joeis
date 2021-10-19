package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158385 a(n) = 676*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158385() {
    super(new long[] {1, -3, 3}, new long[] {678, 2708, 6090});
  }
}
