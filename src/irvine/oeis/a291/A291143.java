package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291143 p-INVERT of <code>(1,1,1,1,1,...)</code>, where p(S) <code>= (1 -</code> S^3)^3.
 * @author Sean A. Irvine
 */
public class A291143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291143() {
    super(new long[] {8, -36, 90, -147, 171, -144, 87, -36, 9}, new long[] {0, 0, 3, 9, 18, 36, 81, 189, 430});
  }
}
