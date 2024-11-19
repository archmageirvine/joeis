package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271624 a(n) = 2*n^2 - 4*n + 4.
 * @author Sean A. Irvine
 */
public class A271624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271624() {
    super(1, new long[] {1, -3, 3}, new long[] {2, 4, 10});
  }
}
