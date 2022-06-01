package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154576 a(n) = 2*n^2 + 14*n + 5.
 * @author Sean A. Irvine
 */
public class A154576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154576() {
    super(new long[] {1, -3, 3}, new long[] {21, 41, 65});
  }
}
