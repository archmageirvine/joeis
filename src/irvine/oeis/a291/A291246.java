package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291246 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - 6 S + S^2.
 * @author Sean A. Irvine
 */
public class A291246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291246() {
    super(new long[] {-1, -6, 1, 6}, new long[] {6, 35, 210, 1259});
  }
}
