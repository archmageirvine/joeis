package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291395 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where <code>p(S) = (1 - 2 S)(1 - 3 S)</code>.
 * @author Sean A. Irvine
 */
public class A291395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291395() {
    super(new long[] {-6, -12, -1, 5}, new long[] {5, 24, 103, 425});
  }
}
