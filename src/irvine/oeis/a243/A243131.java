package irvine.oeis.a243;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A243131 a(n) = 16*n^5 - 20*n^3 + 5*n.
 * @author Sean A. Irvine
 */
public class A243131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243131() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 362, 3363, 15124, 47525});
  }
}
