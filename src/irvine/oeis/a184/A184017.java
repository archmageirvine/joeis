package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184017 <code>n-1+ceiling((n/3)^2);</code> complement of <code>A184016</code>.
 * @author Sean A. Irvine
 */
public class A184017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184017() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {1, 2, 3, 5, 7, 9, 12, 15, 17, 21, 24});
  }
}
