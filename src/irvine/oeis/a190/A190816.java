package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190816 a(n) = 5*n^2 - 4*n + 1.
 * @author Sean A. Irvine
 */
public class A190816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190816() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 13});
  }
}
