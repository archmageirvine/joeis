package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072968 Least k&gt;0 such that the last digit of (n+k)^(n+k) is the same as the last digit of n^n.
 * @author Sean A. Irvine
 */
public class A072968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072968() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {10, 16, 14, 2, 10, 2, 6, 4, 10, 10, 10, 2, 14, 2, 10, 8, 6, 4, 10, 10});
  }
}
