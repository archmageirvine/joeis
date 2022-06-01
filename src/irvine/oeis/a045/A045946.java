package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045946 Star of David matchstick numbers: 6*n*(3*n+1).
 * @author Sean A. Irvine
 */
public class A045946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045946() {
    super(new long[] {1, -3, 3}, new long[] {0, 24, 84});
  }
}
