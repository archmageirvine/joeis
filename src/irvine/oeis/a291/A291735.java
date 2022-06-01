package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291735 p-INVERT of (1,0,1,0,0,0,0,...), where p(S) = 1 - S - S^3.
 * @author Sean A. Irvine
 */
public class A291735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291735() {
    super(new long[] {1, 0, 3, 0, 3, 0, 2, 0, 1}, new long[] {1, 1, 3, 5, 10, 19, 35, 67, 124});
  }
}
