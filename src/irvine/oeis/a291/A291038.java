package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291038 p-INVERT of <code>(1,0,0,1,0,0,1,0,0,...)</code>, where p(S) <code>= (1 - 2</code> S)^2.
 * @author Sean A. Irvine
 */
public class A291038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291038() {
    super(new long[] {-1, 0, -4, 2, -4, 4}, new long[] {4, 12, 32, 84, 216, 544});
  }
}
