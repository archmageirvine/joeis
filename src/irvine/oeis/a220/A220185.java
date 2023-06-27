package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220185 Numbers n such that n^2 + n(n+1) is an oblong number (A002378).
 * @author Sean A. Irvine
 */
public class A220185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220185() {
    super(1, new long[] {1, -35, 35}, new long[] {0, 10, 348});
  }
}
