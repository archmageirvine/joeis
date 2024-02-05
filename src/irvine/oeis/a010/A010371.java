package irvine.oeis.a010;

import irvine.oeis.a006.A006942;

/**
 * A010371 Number of segments used to represent n on a 7-segment calculator display; version where '6', '7' and '9' use 6, 4 and 6 segments, respectively.
 * version where '6', '7' and '9' use 6, 4 and 6 segments, respectively.
 * @author Sean A. Irvine
 */
public class A010371 extends A006942 {

  /** Construct the sequence. */
  public A010371() {
    super(0, new int[] {6, 2, 5, 5, 4, 5, 6, 4, 7, 6});
  }
}
