package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125945 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks at least one of digits <code>1,2,</code> at least one of digits <code>3,4</code> and at least one of digits <code>5,6,7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A125945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125945() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {10, 96, 892, 8076, 71500, 619236, 5241652});
  }
}
