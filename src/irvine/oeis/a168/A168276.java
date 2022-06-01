package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168276 a(n) = 2*n - (-1)^n - 1.
 * @author Sean A. Irvine
 */
public class A168276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168276() {
    super(new long[] {-1, 1, 1}, new long[] {2, 2, 6});
  }
}
