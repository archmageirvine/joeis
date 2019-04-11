package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172020 Number of subsets S of <code>{1,2,3,</code>...,n} with the property that if x is a member of S then at least one of <code>x-2</code> and <code>x+2</code> is also a member of S.
 * @author Sean A. Irvine
 */
public class A172020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172020() {
    super(new long[] {-1, 1, 0, -1, 3, -1, -1, 0, 2}, new long[] {1, 1, 2, 4, 8, 16, 28, 49, 84});
  }
}
