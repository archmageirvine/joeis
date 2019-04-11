package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126632 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks the digit <code>1,</code> at least one of digits <code>2,3,</code> at least one of digits <code>4,5,6</code> and at least one of digits <code>7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A126632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126632() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {9, 79, 669, 5431, 42189, 314119});
  }
}
