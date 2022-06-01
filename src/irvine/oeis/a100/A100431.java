package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100431 Bisection of A002417.
 * @author Sean A. Irvine
 */
public class A100431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100431() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {8, 80, 336, 960, 2200});
  }
}
