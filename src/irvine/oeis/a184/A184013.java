package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184013 <code>n - 1 + ceiling((4+n^2)/5)</code>; complement of <code>A184012</code>.
 * @author Sean A. Irvine
 */
public class A184013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184013() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {1, 3, 5, 7, 10, 13, 17});
  }
}
