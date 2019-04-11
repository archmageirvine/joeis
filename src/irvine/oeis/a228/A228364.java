package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228364 The number of 2-length segments in all possible covers of L-length line by these segments with allowed gaps <code>&lt; 2</code>.
 * @author Sean A. Irvine
 */
public class A228364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228364() {
    super(new long[] {-1, -2, -1, 2, 2, 0}, new long[] {0, 0, 1, 2, 3, 6});
  }
}
