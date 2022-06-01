package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027937 a(n) = T(2*n, n+1), T given by A027935.
 * @author Sean A. Irvine
 */
public class A027937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027937() {
    super(new long[] {-1, 5, -8, 5}, new long[] {1, 7, 26, 79});
  }
}
