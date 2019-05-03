package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291389 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where <code>p(S) = (1 - 5 S)^2</code>.
 * @author Sean A. Irvine
 */
public class A291389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291389() {
    super(new long[] {-25, -50, -15, 10}, new long[] {10, 85, 650, 4700});
  }
}
