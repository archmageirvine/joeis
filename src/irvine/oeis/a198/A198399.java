package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198399 a(n) = 9^n - 9*n.
 * @author Sean A. Irvine
 */
public class A198399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198399() {
    super(new long[] {9, -19, 11}, new long[] {1, 0, 63});
  }
}
