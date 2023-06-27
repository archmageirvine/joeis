package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162254 n*(2*n^2 + 5*n + 1)/2.
 * @author Sean A. Irvine
 */
public class A162254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162254() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {4, 19, 51, 106});
  }
}
