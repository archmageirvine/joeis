package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189836 a(n) = n^2 + 11.
 * @author Sean A. Irvine
 */
public class A189836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189836() {
    super(new long[] {1, -3, 3}, new long[] {11, 12, 15});
  }
}
