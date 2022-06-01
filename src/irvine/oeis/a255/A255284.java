package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255284 a(n) = A255283(2^n-1).
 * @author Sean A. Irvine
 */
public class A255284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255284() {
    super(new long[] {-28, 7, 4}, new long[] {1, 7, 31});
  }
}
