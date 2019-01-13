package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212756.
 * @author Sean A. Irvine
 */
public class A212756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212756() {
    super(new long[] {-1, -2, 0, 5, 7, 0, -9, -9, 0, 7, 5, 0, -2}, new long[] {1, 4, 17, 32, 71, 104, 187, 247, 380, 484, 685, 823, 1122});
  }
}
