package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125897 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks at least one of the digits 1,2,3 and at least one of the digits 4,5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A125897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125897() {
    super(new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {10, 100, 994, 9796, 95650, 924820, 8845714, 83575396});
  }
}
