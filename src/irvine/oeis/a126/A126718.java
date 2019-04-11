package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126718 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks the digits 1,2,3, at least one of digits 4,5, at least one of digits 6,7 and at least one of digits 8,9.
 * @author Sean A. Irvine
 */
public class A126718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126718() {
    super(new long[] {-24, 50, -35, 10}, new long[] {7, 43, 235, 1171});
  }
}
