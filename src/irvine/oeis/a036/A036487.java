package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036487 a(n) = floor((n^3)/2).
 * @author Sean A. Irvine
 */
public class A036487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036487() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 4, 13, 32});
  }
}
