package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126643 a(n) is the number of integers k less than 10^n such that the decimal representation of k lacks the digits 1,2,3,4, at least one of digits 5,6 and at least one of digits 7,8,9.
 * @author Sean A. Irvine
 */
public class A126643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126643() {
    super(new long[] {-24, 50, -35, 10}, new long[] {6, 34, 180, 886});
  }
}
