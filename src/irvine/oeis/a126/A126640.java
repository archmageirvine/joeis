package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126640 a(n) is the number of integers k less than 10^n such that the decimal representation of k lacks the digit 1 and 2, at least one of digits 3,4, at least one of digits 5,6 and at least one of digits 7,8,9.
 * @author Sean A. Irvine
 */
public class A126640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126640() {
    super(1, new long[] {120, -274, 225, -85, 15}, new long[] {8, 60, 422, 2784, 17318});
  }
}
