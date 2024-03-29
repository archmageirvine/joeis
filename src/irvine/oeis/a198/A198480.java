package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198480 a(n) = 2*7^n - 1.
 * @author Sean A. Irvine
 */
public class A198480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198480() {
    super(new long[] {-7, 8}, new long[] {1, 13});
  }
}
