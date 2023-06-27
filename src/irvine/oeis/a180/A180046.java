package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180046 a(n+1) = a(n-3) + a(n-2) - a(n-1) + a(n).
 * @author Sean A. Irvine
 */
public class A180046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180046() {
    super(1, new long[] {1, 1, -1, 1}, new long[] {1, 2, 3, 4});
  }
}
