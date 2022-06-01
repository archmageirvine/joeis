package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157948 a(n) = 64*n^2 - n.
 * @author Sean A. Irvine
 */
public class A157948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157948() {
    super(new long[] {1, -3, 3}, new long[] {63, 254, 573});
  }
}
