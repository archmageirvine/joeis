package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291240 p-INVERT of (0,1,0,1,0,1,...), where p(S) = (1 - S^3)^2.
 * @author Sean A. Irvine
 */
public class A291240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291240() {
    super(new long[] {-1, 0, 6, -2, -15, 6, 19, -6, -15, 2, 6, 0}, new long[] {0, 0, 2, 0, 6, 3, 12, 18, 24, 63, 66, 173});
  }
}
