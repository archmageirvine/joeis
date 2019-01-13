package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263689.
 * @author Sean A. Irvine
 */
public class A263689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263689() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 1, 2, 34, 277, 1301, 4426});
  }
}
