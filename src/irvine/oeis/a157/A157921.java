package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157921 a(n) = 72*n - 1.
 * @author Sean A. Irvine
 */
public class A157921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157921() {
    super(1, new long[] {-1, 2}, new long[] {71, 143});
  }
}
