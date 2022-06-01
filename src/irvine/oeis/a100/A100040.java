package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100040 a(n) = 2*n^2 + n - 5.
 * @author Sean A. Irvine
 */
public class A100040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100040() {
    super(new long[] {1, -3, 3}, new long[] {-5, -2, 5});
  }
}
