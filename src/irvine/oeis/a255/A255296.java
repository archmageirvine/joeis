package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255296 a(n) = A255295(2^n-1).
 * @author Sean A. Irvine
 */
public class A255296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255296() {
    super(new long[] {-4, -4, 5}, new long[] {1, 6, 24});
  }
}
