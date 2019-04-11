package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126643 <code>a(n)</code> is the number of integers k less than <code>10^n</code> such that the decimal representation of k lacks the digits <code>1,2,3,4,</code> at least one of digits <code>5,6</code> and at least one of digits <code>7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A126643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126643() {
    super(new long[] {-24, 50, -35, 10}, new long[] {6, 34, 180, 886});
  }
}
