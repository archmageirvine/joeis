package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291223 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - S^3 - S^4.
 * @author Sean A. Irvine
 */
public class A291223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291223() {
    super(new long[] {-1, 0, 4, -1, -5, 1, 4, 0}, new long[] {0, 0, 1, 1, 3, 5, 8, 17});
  }
}
