package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126642 <code>a(n)</code> is the number of integers k less than <code>10^n</code> such that the decimal representation of k lacks the digits 1,2,3,4 and 5 and at least one of digits 6,7,8,9.
 * @author Sean A. Irvine
 */
public class A126642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126642() {
    super(new long[] {-24, 50, -35, 10}, new long[] {5, 25, 125, 601});
  }
}
