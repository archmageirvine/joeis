package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093918.
 * @author Sean A. Irvine
 */
public class A093918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093918() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {2, 8, 11, 27, 28, 58});
  }
}
