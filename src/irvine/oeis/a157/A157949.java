package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157949 a(n) = 128*n - 1.
 * @author Sean A. Irvine
 */
public class A157949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157949() {
    super(1, new long[] {-1, 2}, new long[] {127, 255});
  }
}
