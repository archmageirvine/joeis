package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183857 <code>n-1+ceiling((2/3)*n^2)</code>; complement of <code>A183874</code>.
 * @author Sean A. Irvine
 */
public class A183857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183857() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 4, 8, 14, 21});
  }
}
