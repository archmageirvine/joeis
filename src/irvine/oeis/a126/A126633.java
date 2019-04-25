package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126633 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks at least one of digits 1, 2, at least one of digits 3,4, at least one of digits 5,6 and at least one of digits 7,8,9.
 * @author Sean A. Irvine
 */
public class A126633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126633() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {10, 94, 832, 6946, 54880, 412714});
  }
}
