package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291253 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where <code>p(S) = (1 - S - S^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A291253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291253() {
    super(new long[] {-1, -2, 5, 8, -9, -8, 5, 2}, new long[] {2, 5, 12, 30, 70, 166, 382, 881});
  }
}
