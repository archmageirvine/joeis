package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097813 a(n) = 3*2^n - 2*n - 2.
 * @author Sean A. Irvine
 */
public class A097813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097813() {
    super(new long[] {2, -5, 4}, new long[] {1, 2, 6});
  }
}
