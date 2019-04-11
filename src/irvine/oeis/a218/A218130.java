package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218130 Number of length 6 primitive (=aperiodic or period <code>6)</code> n-ary words.
 * @author Sean A. Irvine
 */
public class A218130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218130() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 54, 696, 4020, 15480, 46410});
  }
}
