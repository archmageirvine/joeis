package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157952 a(n) = 162*n + 1.
 * @author Sean A. Irvine
 */
public class A157952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157952() {
    super(1, new long[] {-1, 2}, new long[] {163, 325});
  }
}
