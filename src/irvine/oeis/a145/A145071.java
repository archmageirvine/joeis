package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145071 Partial sums of A000051, starting at n=1.
 * @author Sean A. Irvine
 */
public class A145071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145071() {
    super(new long[] {2, -5, 4}, new long[] {3, 8, 17});
  }
}
