package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100048 A Chebyshev transform of the Pell numbers.
 * @author Sean A. Irvine
 */
public class A100048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100048() {
    super(new long[] {-1, 2, -1, 2}, new long[] {0, 1, 2, 2});
  }
}
