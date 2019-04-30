package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183859 <code>n-1+ceiling((n^2)/3)</code>; complement of A183858.
 * @author Sean A. Irvine
 */
public class A183859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183859() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 3, 5, 9, 13});
  }
}
