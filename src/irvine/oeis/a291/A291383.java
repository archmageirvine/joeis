package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291383 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - 2 S - 2 S^2.
 * @author Sean A. Irvine
 */
public class A291383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291383() {
    super(new long[] {2, 4, 4, 2}, new long[] {2, 8, 28, 98});
  }
}
