package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126640 <code>a(n)</code> is the number of integers k less than <code>10^n</code> such that the decimal representation of k lacks the digit 1 and 2, at least one of digits 3,4, at least one of digits 5,6 and at least one of digits 7,8,9.
 * @author Sean A. Irvine
 */
public class A126640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126640() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {8, 60, 422, 2784, 17318});
  }
}
