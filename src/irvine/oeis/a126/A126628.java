package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126628 a(n) is the number of nonnegative integers k less than 10^n such that the decimal representation of k lacks digits 1 and 2, at least one of digits 3,4 and at least one of digits 5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A126628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126628() {
    super(1, new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {8, 62, 470, 3506, 25718, 184682});
  }
}
