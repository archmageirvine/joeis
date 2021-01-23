package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157914 a(n) = 8*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A157914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157914() {
    super(new long[] {1, -3, 3}, new long[] {7, 31, 71});
  }
}
