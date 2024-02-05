package irvine.oeis.a277;

import irvine.oeis.a006.A006942;

/**
 * A277116 Number of segments used to represent the number n on a 7-segment display: variant where digits 6, 7 and 9 use 6, 3 and 5 segments, respectively.
 * variant where digits 6, 7 and 9 use 6, 3 and 5 segments, respectively.
 * @author Georg Fischer
 */
public class A277116 extends A006942 {

  /** Construct the sequence. */
  public A277116() {
    super(0, new int[] {6, 2, 5, 5, 4, 5, 6, 3, 7, 5});
  }
}
