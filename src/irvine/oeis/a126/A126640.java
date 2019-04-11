package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126640 <code>a(n)</code> is the number of integers k less than <code>10^n</code> such that the decimal representation of k lacks the digit 1 and <code>2,</code> at least one of digits <code>3,4,</code> at least one of digits <code>5,6</code> and at least one of digits <code>7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A126640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126640() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {8, 60, 422, 2784, 17318});
  }
}
