package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291220 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - S - S^4.
 * @author Sean A. Irvine
 */
public class A291220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291220() {
    super(new long[] {-1, -1, 4, 3, -5, -3, 4, 1}, new long[] {1, 1, 2, 4, 7, 15, 27, 55});
  }
}
