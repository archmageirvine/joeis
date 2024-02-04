package irvine.oeis.a063;

import irvine.oeis.a006.A006942;

/**
 * A063720 Number of segments lit in a 7-segment display (as on a calculator) to represent the number n,
 * variant 0: '6', '7' and '9' use 5, 3 and 5 segments, respectively.
 * @author Sean A. Irvine
 */
public class A063720 extends A006942 {

  /** Construct the sequence. */
  public A063720() {
    super(0, new int[] {6, 2, 5, 5, 4, 5, 5, 3, 7, 5});
  }
}
