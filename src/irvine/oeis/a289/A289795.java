package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289795 p-INVERT of <code>(3n)</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289795() {
    super(new long[] {-1, 7, -3, 7}, new long[] {3, 24, 162, 1083});
  }
}
