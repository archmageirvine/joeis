package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136211 Denominators in continued fraction [0; 1, 3, 1, 3, 1, 3, ...].
 * @author Sean A. Irvine
 */
public class A136211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136211() {
    super(1, new long[] {-1, 0, 5, 0}, new long[] {1, 4, 5, 19});
  }
}
