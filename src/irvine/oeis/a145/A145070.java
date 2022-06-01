package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145070 Partial sums of A006127, starting at n=1.
 * @author Sean A. Irvine
 */
public class A145070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145070() {
    super(new long[] {-2, 7, -9, 5}, new long[] {3, 9, 20, 40});
  }
}
