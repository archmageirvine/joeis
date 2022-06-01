package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291221 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - S^3 - S^6.
 * @author Sean A. Irvine
 */
public class A291221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291221() {
    super(new long[] {-1, 0, 6, -1, -15, 3, 21, -3, -15, 1, 6, 0}, new long[] {0, 0, 1, 0, 3, 2, 6, 12, 13, 42, 42, 117});
  }
}
