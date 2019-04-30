package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291382 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where p(S) <code>= 1 - 2</code> S - S^2.
 * @author Sean A. Irvine
 */
public class A291382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291382() {
    super(new long[] {1, 2, 3, 2}, new long[] {2, 7, 22, 70});
  }
}
