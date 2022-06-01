package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081590 Fourth row of Pascal-(1,5,1) array A081580.
 * @author Sean A. Irvine
 */
public class A081590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081590() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 19, 145, 595});
  }
}
