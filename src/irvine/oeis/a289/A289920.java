package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289920 p-INVERT of <code>(1,0,0,1,0,0,1,0,0,...)</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289920() {
    super(new long[] {-1, 0, -1, 2, 1, 1}, new long[] {1, 2, 3, 6, 12, 22});
  }
}
