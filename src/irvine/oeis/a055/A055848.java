package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055848.
 * @author Sean A. Irvine
 */
public class A055848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055848() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 15, 105, 495, 1815, 5577, 15015, 36465, 81510, 170170});
  }
}
