package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102650 a(n) = 4 * floor(28*2^n/15).
 * @author Sean A. Irvine
 */
public class A102650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102650() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {4, 12, 28, 56, 116});
  }
}
