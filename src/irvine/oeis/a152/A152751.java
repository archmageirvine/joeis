package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152751 3 times octagonal numbers: 3*n*(3*n-2).
 * @author Sean A. Irvine
 */
public class A152751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152751() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 24});
  }
}
