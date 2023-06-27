package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126627 a(n) is the number of nonnegative integers k less than 10^n such that the decimal representation of k lacks digits 1,2,3 and at least one of digits 4,5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A126627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126627() {
    super(1, new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {7, 49, 343, 2401, 16807, 116929});
  }
}
