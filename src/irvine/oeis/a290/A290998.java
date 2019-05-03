package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290998 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = 1 - S^3 - S^4</code>.
 * @author Sean A. Irvine
 */
public class A290998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290998() {
    super(new long[] {-1, 5, -6, 4}, new long[] {0, 0, 1, 4});
  }
}
