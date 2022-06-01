package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017354 a(n) = (10*n + 7)^2.
 * @author Sean A. Irvine
 */
public class A017354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017354() {
    super(new long[] {1, -3, 3}, new long[] {49, 289, 729});
  }
}
