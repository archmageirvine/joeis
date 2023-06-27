package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092364 a(n) = n^2*binomial(n,2).
 * @author Sean A. Irvine
 */
public class A092364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092364() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 27, 96, 250});
  }
}
