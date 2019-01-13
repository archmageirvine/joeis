package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152032.
 * @author Sean A. Irvine
 */
public class A152032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152032() {
    super(new long[] {1, 2, 0, -2}, new long[] {1, -1, 3, -4});
  }
}
