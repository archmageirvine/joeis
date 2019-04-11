package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126633 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks at least one of digits <code>1, 2,</code> at least one of digits <code>3,4,</code> at least one of digits <code>5,6</code> and at least one of digits <code>7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A126633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126633() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {10, 94, 832, 6946, 54880, 412714});
  }
}
