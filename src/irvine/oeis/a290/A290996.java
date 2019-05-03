package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290996 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = 1 - S - S^4</code>.
 * @author Sean A. Irvine
 */
public class A290996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290996() {
    super(new long[] {-1, 7, -9, 5}, new long[] {1, 2, 4, 9});
  }
}
