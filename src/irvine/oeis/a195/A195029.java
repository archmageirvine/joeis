package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195029 a(n) = n*(14*n + 13) + 3.
 * @author Sean A. Irvine
 */
public class A195029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195029() {
    super(new long[] {1, -3, 3}, new long[] {3, 30, 85});
  }
}
