package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291379 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - S^4.
 * @author Sean A. Irvine
 */
public class A291379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291379() {
    super(new long[] {1, 4, 6, 4, 1, 0, 0, 0}, new long[] {0, 0, 0, 1, 4, 6, 4, 2});
  }
}
