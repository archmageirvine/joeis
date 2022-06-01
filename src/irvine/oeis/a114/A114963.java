package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114963 a(n) = n^2 + 22.
 * @author Sean A. Irvine
 */
public class A114963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114963() {
    super(new long[] {1, -3, 3}, new long[] {22, 23, 26});
  }
}
