package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056827 a(n) = floor(n^2/6).
 * @author Sean A. Irvine
 */
public class A056827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056827() {
    super(new long[] {1, -2, 1, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 1, 2, 4, 6, 8});
  }
}
