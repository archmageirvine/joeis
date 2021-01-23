package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117560 a(n) = n*(n^2 - 1)/2 - 1.
 * @author Sean A. Irvine
 */
public class A117560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117560() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 11, 29, 59});
  }
}
