package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158551 <code>a(n) = 26*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158551() {
    super(new long[] {1, -3, 3}, new long[] {25, 103, 233});
  }
}
