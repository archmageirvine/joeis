package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212506.
 * @author Sean A. Irvine
 */
public class A212506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212506() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 16, 64, 196, 441, 900, 1600});
  }
}
