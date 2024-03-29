package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158402 a(n) = 841*n - 1.
 * @author Sean A. Irvine
 */
public class A158402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158402() {
    super(1, new long[] {-1, 2}, new long[] {840, 1681});
  }
}
