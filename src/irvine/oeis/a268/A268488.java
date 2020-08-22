package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268488 Least number k of the form k = n*(k % 10) + [k / 10], where k % 10 = last digit of k, [k / 10] = k without its last digit.
 * @author Sean A. Irvine
 */
public class A268488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268488() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 19, 29, 13, 49, 59, 23, 79, 89, 11, 109, 119, 43, 139, 149, 53, 169, 179});
  }
}
