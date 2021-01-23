package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022271 a(n) = n*(13*n + 1)/2.
 * @author Sean A. Irvine
 */
public class A022271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022271() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 27});
  }
}
