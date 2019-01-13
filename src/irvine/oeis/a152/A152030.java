package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152030.
 * @author Sean A. Irvine
 */
public class A152030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152030() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, -4, 2, 366, 2732, 11720, 37326});
  }
}
