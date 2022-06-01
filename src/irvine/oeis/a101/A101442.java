package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101442 a(n) = 9973*n + 10007.
 * @author Sean A. Irvine
 */
public class A101442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101442() {
    super(new long[] {-1, 2}, new long[] {10007, 19980});
  }
}
