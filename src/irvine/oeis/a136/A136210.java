package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136210 Numerators in continued fraction [0; 1, 3, 1, 3, 1, 3, ...].
 * @author Sean A. Irvine
 */
public class A136210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136210() {
    super(1, new long[] {-1, 0, 5, 0}, new long[] {1, 3, 4, 15});
  }
}
