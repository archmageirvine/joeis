package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186042 Numbers of the form <code>2*k + 1, 3*k + 2,</code> or <code>5*k + 3</code>.
 * @author Sean A. Irvine
 */
public class A186042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186042() {
    super(new long[] {-1, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2}, new long[] {1, 2, 3, 5, 7, 8, 9, 11, 13, 14, 15, 17, 18, 19, 20, 21, 23, 25, 26, 27, 28, 29});
  }
}
