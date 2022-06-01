package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114444 a(n) = 16*n*(n+2).
 * @author Sean A. Irvine
 */
public class A114444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114444() {
    super(new long[] {1, -3, 3}, new long[] {0, 48, 128});
  }
}
