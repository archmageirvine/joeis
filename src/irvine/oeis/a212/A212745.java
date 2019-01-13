package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212745.
 * @author Sean A. Irvine
 */
public class A212745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212745() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {1, 8, 27, 83, 162, 277, 495, 730, 1025, 1513});
  }
}
