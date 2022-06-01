package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152777 7 times heptagonal numbers: 7*n*(5*n-3)/2.
 * @author Sean A. Irvine
 */
public class A152777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152777() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 49});
  }
}
