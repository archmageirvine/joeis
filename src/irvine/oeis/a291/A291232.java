package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291232 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where <code>p(S) = (1 - 3 S)^2</code>.
 * @author Sean A. Irvine
 */
public class A291232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291232() {
    super(new long[] {-1, -6, -7, 6}, new long[] {6, 27, 114, 459});
  }
}
