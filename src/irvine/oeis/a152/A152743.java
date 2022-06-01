package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152743 6 times pentagonal numbers: a(n) = 3*n*(3*n-1).
 * @author Sean A. Irvine
 */
public class A152743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152743() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 30});
  }
}
