package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060104.
 * @author Sean A. Irvine
 */
public class A060104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060104() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 19, 140, 660, 2370, 7062, 18348, 42900, 92235});
  }
}
