package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271625 a(n) = 2n^2 + 4n - 3.
 * @author Sean A. Irvine
 */
public class A271625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271625() {
    super(1, new long[] {1, -3, 3}, new long[] {3, 13, 27});
  }
}
