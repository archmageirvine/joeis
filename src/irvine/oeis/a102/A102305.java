package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102305 a(n) = n^2 + 2*n + 3.
 * @author Sean A. Irvine
 */
public class A102305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102305() {
    super(new long[] {1, -3, 3}, new long[] {6, 11, 18});
  }
}
