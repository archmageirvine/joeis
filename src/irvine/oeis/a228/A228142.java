package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228142 Number of blocks in a Steiner system S(2, <code>5,</code> A228141(n+1)).
 * @author Sean A. Irvine
 */
public class A228142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228142() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 21, 30, 82, 99});
  }
}
