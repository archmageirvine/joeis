package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096261 Number of n-tuples of 0,1,2,3,4,5,6,7,8,9 without consecutive digits.
 * @author Sean A. Irvine
 */
public class A096261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096261() {
    super(new long[] {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10}, new long[] {1, 10, 91, 828, 7534, 68552, 623756, 5675568, 51642104, 469892512});
  }
}
