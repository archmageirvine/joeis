package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070419 a(n) = 7^n mod 36.
 * @author Sean A. Irvine
 */
public class A070419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070419() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 7, 13, 19, 25, 31});
  }
}
