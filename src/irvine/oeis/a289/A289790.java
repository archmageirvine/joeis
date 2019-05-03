package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289790 p-INVERT of <code>A016789</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289790() {
    super(new long[] {1, 8, -5, 6}, new long[] {2, 13, 72, 385});
  }
}
