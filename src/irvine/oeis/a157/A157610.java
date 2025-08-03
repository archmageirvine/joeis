package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157610 a(n) = 29282*n^2 - 484*n + 1.
 * @author Sean A. Irvine
 */
public class A157610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157610() {
    super(1, new long[] {1, -3, 3}, new long[] {28799, 116161, 262087});
  }
}
