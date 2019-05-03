package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291238 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where <code>p(S) = (1 - S)^2 (1 - 2 S)</code>.
 * @author Sean A. Irvine
 */
public class A291238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291238() {
    super(new long[] {1, 4, 2, -6, -2, 4}, new long[] {4, 11, 30, 79, 202, 508});
  }
}
