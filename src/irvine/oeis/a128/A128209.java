package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128209 Jacobsthal numbers(A001045) + 1.
 * @author Sean A. Irvine
 */
public class A128209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128209() {
    super(new long[] {-2, 1, 2}, new long[] {1, 2, 2});
  }
}
