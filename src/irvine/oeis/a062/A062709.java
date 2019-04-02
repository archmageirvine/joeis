package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062709 a(n) = 2^n + 3.
 * @author Sean A. Irvine
 */
public class A062709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062709() {
    super(new long[] {-2, 3}, new long[] {4, 5});
  }
}
