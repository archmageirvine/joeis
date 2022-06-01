package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100255 Squares of pentagonal numbers: a(n) = (1/4)*n^2*(3*n-1)^2.
 * @author Sean A. Irvine
 */
public class A100255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100255() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 25, 144, 484});
  }
}
