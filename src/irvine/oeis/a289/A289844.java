package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289844 p-INVERT of <code>A175676 (starting</code> at <code>n=3)</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289844() {
    super(new long[] {-1, 0, 0, 4, 0, 1, -6, 0, -2, 4, 1, 1}, new long[] {1, 2, 3, 7, 16, 31, 64, 134, 274, 567, 1168, 2405});
  }
}
