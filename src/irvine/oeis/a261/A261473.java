package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261473 Number of binary strings of length n+6 such that the smallest number whose binary representation is not visible in the string is 8.
 * @author Sean A. Irvine
 */
public class A261473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261473() {
    super(new long[] {-1, -3, -2, 6, 16, 9, -17, -36, -16, 30, 44, 11, -33, -29, 0, 21, 10, -6, -5, -2, 4}, new long[] {0, 2, 10, 40, 116, 296, 699, 1557, 3325, 6893, 13964, 27789, 54536, 105854, 203645, 388970, 738596, 1395718, 2626914, 4927664, 9217604});
  }
}
