package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291220 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where <code>p(S) = 1 - S - S^4</code>.
 * @author Sean A. Irvine
 */
public class A291220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291220() {
    super(new long[] {-1, -1, 4, 3, -5, -3, 4, 1}, new long[] {1, 1, 2, 4, 7, 15, 27, 55});
  }
}
