package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017486 a(n) = (11*n + 8)^2.
 * @author Sean A. Irvine
 */
public class A017486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017486() {
    super(new long[] {1, -3, 3}, new long[] {64, 361, 900});
  }
}
