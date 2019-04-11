package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070302 Number of 3 X 3 X 3 magic cubes with sum <code>3n</code>.
 * @author Sean A. Irvine
 */
public class A070302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070302() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 19, 121, 439, 1171});
  }
}
