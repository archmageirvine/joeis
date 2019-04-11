package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126634 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks the digits 1,2,3,4 and at least one of digits 5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A126634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126634() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {6, 36, 216, 1296, 7656});
  }
}
