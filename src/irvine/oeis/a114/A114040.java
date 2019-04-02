package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114040 a(0) = 1, a(1) = 9, a(n) = 6*a(n-1) - a(n-2) - 4.
 * @author Sean A. Irvine
 */
public class A114040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114040() {
    super(new long[] {1, -7, 7}, new long[] {1, 9, 49});
  }
}
