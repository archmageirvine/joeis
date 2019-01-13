package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091779.
 * @author Sean A. Irvine
 */
public class A091779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091779() {
    super(new long[] {-1, 4, -6, 6, -9, 13, -13, 13, -16, 19, -19, 18, -19, 19, -16, 13, -13, 13, -9, 6, -6, 4}, new long[] {1, 2, 4, 8, 14, 24, 40, 64, 99, 150, 222, 322, 460, 646, 894, 1222, 1649, 2200, 2906, 3800, 4924, 6328});
  }
}
