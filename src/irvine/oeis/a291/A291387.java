package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291387 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where <code>p(S) = (1 - 4 S)^2</code>.
 * @author Sean A. Irvine
 */
public class A291387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291387() {
    super(new long[] {-16, -32, -8, 8}, new long[] {8, 56, 352, 2096});
  }
}
