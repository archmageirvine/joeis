package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118277 Generalized 9-gonal (or enneagonal) numbers: m*(7*m - 5)/2 with m = 0, 1, -1, 2, -2, 3, -3, ...
 * @author Sean A. Irvine
 */
public class A118277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118277() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 6, 9, 19});
  }
}
