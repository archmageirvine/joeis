package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126639 a(n) is the number of integers k less than 10^n such that the decimal representation of k lacks the digit 1,2,3, at least one of digits 4,5,6 and at least one of digits 7,8,9.
 * @author Sean A. Irvine
 */
public class A126639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126639() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {7, 49, 331, 2137, 13147});
  }
}
