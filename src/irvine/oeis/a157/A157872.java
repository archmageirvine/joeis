package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157872 a(n) = 9*n^2 - 3.
 * @author Sean A. Irvine
 */
public class A157872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157872() {
    super(1, new long[] {1, -3, 3}, new long[] {6, 33, 78});
  }
}
