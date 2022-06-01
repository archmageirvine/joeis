package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161705 a(n) = 18*n + 1.
 * @author Sean A. Irvine
 */
public class A161705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161705() {
    super(new long[] {-1, 2}, new long[] {1, 19});
  }
}
