package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291143 p-INVERT of (1,1,1,1,1,...), where p(S) = (1 - S^3)^3.
 * @author Sean A. Irvine
 */
public class A291143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291143() {
    super(new long[] {8, -36, 90, -147, 171, -144, 87, -36, 9}, new long[] {0, 0, 3, 9, 18, 36, 81, 189, 430});
  }
}
