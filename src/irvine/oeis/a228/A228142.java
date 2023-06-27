package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228142 Number of blocks in a Steiner system S(2, 5, A228141(n+1)).
 * @author Sean A. Irvine
 */
public class A228142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228142() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {1, 21, 30, 82, 99});
  }
}
