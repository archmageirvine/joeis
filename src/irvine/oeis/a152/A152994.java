package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152994 Nine times hexagonal numbers: a(n) = 9*n*(2*n-1).
 * @author Sean A. Irvine
 */
public class A152994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152994() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 54});
  }
}
