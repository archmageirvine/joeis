package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057354 a(n) = floor(2*n/5).
 * @author Sean A. Irvine
 */
public class A057354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057354() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 1, 2});
  }
}
