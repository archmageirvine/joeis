package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157822 1482401250n^2+108900n+1.
 * @author Sean A. Irvine
 */
public class A157822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157822() {
    super(1, new long[] {1, -3, 3}, new long[] {1482510151, 5929822801L, 13341937951L});
  }
}
