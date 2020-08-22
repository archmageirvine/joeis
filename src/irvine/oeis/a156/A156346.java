package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156346 Palindromic period of length 12: repeat 1,2,-4,4,-2,-1,-1,-2,4,-4,2,1.
 * @author Sean A. Irvine
 */
public class A156346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156346() {
    super(new long[] {-1, 0, 0, 0, 0, 0}, new long[] {1, 2, -4, 4, -2, -1});
  }
}
