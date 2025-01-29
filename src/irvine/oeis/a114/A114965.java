package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114965 a(n) = n^2 + 34.
 * @author Sean A. Irvine
 */
public class A114965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114965() {
    super(0, new long[] {1, -3, 3}, new long[] {34, 35, 38});
  }
}
