package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291217 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - S^3.
 * @author Sean A. Irvine
 */
public class A291217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291217() {
    super(new long[] {1, 0, -3, 1, 3, 0}, new long[] {0, 0, 1, 0, 3, 1});
  }
}
