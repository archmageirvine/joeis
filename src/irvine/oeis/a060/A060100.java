package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060100 Fifth column (m=4) of triangle A060098.
 * @author Sean A. Irvine
 */
public class A060100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060100() {
    super(new long[] {1, -5, 6, 10, -29, 9, 36, -36, -9, 29, -10, -6, 5}, new long[] {1, 5, 19, 55, 140, 316, 660, 1284, 2370, 4170, 7062, 11550, 18348});
  }
}
