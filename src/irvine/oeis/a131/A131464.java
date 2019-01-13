package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131464.
 * @author Sean A. Irvine
 */
public class A131464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131464() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 23, 86, 215});
  }
}
