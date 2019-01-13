package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069362.
 * @author Sean A. Irvine
 */
public class A069362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069362() {
    super(new long[] {-128, -1272, 1264, -378, 35}, new long[] {1, 41, 1041, 22193, 433809});
  }
}
