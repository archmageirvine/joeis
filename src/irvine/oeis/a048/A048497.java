package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048497 a(n) = 2^(n-1)*(4*n - 6) + 4.
 * @author Sean A. Irvine
 */
public class A048497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048497() {
    super(new long[] {4, -8, 5}, new long[] {1, 2, 8});
  }
}
