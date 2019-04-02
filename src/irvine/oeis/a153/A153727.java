package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153727 Period 3: repeat [1, 4, 2] ; Trajectory of 3x+1 sequence starting at 1.
 * @author Sean A. Irvine
 */
public class A153727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153727() {
    super(new long[] {1, 0, 0}, new long[] {1, 4, 2});
  }
}
