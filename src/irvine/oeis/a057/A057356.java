package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057356 a(n) = floor(2*n/7).
 * @author Sean A. Irvine
 */
public class A057356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057356() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 0, 1, 1, 1, 2});
  }
}
