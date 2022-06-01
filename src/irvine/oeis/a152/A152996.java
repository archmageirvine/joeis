package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152996 9 times pentagonal numbers: 9*n*(3*n-1)/2.
 * @author Sean A. Irvine
 */
public class A152996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152996() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 45});
  }
}
