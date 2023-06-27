package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220755 Numbers n such that n^2 + n(n+1)/2 is an oblong number (A002378).
 * @author Sean A. Irvine
 */
public class A220755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220755() {
    super(1, new long[] {1, -1, -98, 98, 1}, new long[] {0, 1, 28, 117, 2760});
  }
}
