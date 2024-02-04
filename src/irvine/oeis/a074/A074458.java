package irvine.oeis.a074;

import irvine.oeis.a006.A006942;

/**
 * A074458 Number of segments lit to display the number n on a 7-segment display (as in pocket calculators):
 * variant where '6', '7' and '9' use 6, 4 resp. 5 segments.
 * @author Sean A. Irvine
 */
public class A074458 extends A006942 {

  public A074458() {
    super(0, new int[] {6, 2, 5, 5, 4, 5, 6, 4, 7, 5});
  }
}
