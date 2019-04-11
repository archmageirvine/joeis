package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157838 <code>3600n^2 - 6049n + 2541</code>.
 * @author Sean A. Irvine
 */
public class A157838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157838() {
    super(new long[] {1, -3, 3}, new long[] {92, 4843, 16794});
  }
}
