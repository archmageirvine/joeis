package irvine.oeis.a071;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A071358 Least k&gt;0 such that the last digit of (n+k)^n is the same as the last digit of n^n.
 * @author Sean A. Irvine
 */
public class A071358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071358() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {10, 6, 10, 2, 10, 8, 10, 4, 10, 10, 10, 2, 10, 2, 10, 2, 10, 4, 10, 10});
  }
}
