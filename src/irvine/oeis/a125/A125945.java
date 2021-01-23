package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125945 a(n) is the number of nonnegative integers k less than 10^n such that the decimal representation of k lacks at least one of digits 1,2, at least one of digits 3,4 and at least one of digits 5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A125945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125945() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {10, 96, 892, 8076, 71500, 619236, 5241652});
  }
}
