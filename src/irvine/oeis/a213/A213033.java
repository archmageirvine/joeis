package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213033 n*[n/2]*[n/3], where [] = floor.
 * @author Sean A. Irvine
 */
public class A213033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213033() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 2, 0, -2, -2, 0, 2, -1, 0, 1, 1, 0}, new long[] {0, 0, 0, 3, 8, 10, 36, 42, 64, 108, 150, 165, 288, 312, 392, 525, 640});
  }
}
