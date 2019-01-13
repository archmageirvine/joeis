package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131732.
 * @author Sean A. Irvine
 */
public class A131732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131732() {
    super(new long[] {-1, -2, -3, -4, -3, -2}, new long[] {1, -3, 2, 0, 3, -7});
  }
}
