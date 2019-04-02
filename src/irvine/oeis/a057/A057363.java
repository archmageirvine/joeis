package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057363 a(n) = floor(8*n/13).
 * @author Sean A. Irvine
 */
public class A057363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057363() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8});
  }
}
