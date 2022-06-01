package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050486 a(n) = binomial(n+6,6)*(2n+7)/7.
 * @author Sean A. Irvine
 */
public class A050486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050486() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 9, 44, 156, 450, 1122, 2508, 5148});
  }
}
