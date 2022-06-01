package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097809 a(n) = 5*2^n - 2*n - 4.
 * @author Sean A. Irvine
 */
public class A097809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097809() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 12});
  }
}
