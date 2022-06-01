package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017558 a(n) = (12*n + 3)^2.
 * @author Sean A. Irvine
 */
public class A017558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017558() {
    super(new long[] {1, -3, 3}, new long[] {9, 225, 729});
  }
}
