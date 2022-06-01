package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154358 a(n) = 1250*n^2 - 1800*n + 649.
 * @author Sean A. Irvine
 */
public class A154358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154358() {
    super(new long[] {1, -3, 3}, new long[] {649, 99, 2049});
  }
}
