package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290994 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = 1 - S^7</code>.
 * @author Sean A. Irvine
 */
public class A290994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290994() {
    super(new long[] {2, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}
