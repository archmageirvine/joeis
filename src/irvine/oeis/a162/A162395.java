package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162395 a(n) = -(-1)^n * n^2.
 * @author Sean A. Irvine
 */
public class A162395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162395() {
    super(new long[] {-1, -3, -3}, new long[] {1, -4, 9});
  }
}
