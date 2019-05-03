package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291008 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = 1 - 7*S^2</code>.
 * @author Sean A. Irvine
 */
public class A291008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291008() {
    super(new long[] {6, 2}, new long[] {0, 7});
  }
}
