package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291405 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where <code>p(S) = 1 - 2 S^2 - 2 S^4</code>.
 * @author Sean A. Irvine
 */
public class A291405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291405() {
    super(new long[] {2, 8, 12, 8, 4, 4, 2, 0}, new long[] {0, 2, 4, 8, 24, 52, 120, 290});
  }
}
